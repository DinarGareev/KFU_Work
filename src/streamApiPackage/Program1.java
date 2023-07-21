package streamApiPackage;

public class Program1 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,34,445,5,6,66,55,778};
        int count = 0;
        for (int i : nums1){
            if (i % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
