package oop01.dinar.lesson1;

public class lesson1 {
    public static void main(String[] args) {
        int value = 14;
        int[] values = {value,13,67,54,3};
        printArray(values);
    }

    private static  void printArray(int [] val){
       for (int i = 0; i<val.length;i++){
           System.out.println(val[i]);
       }
        for (int value : val) {
            System.out.println(value);
        }
    }


}
