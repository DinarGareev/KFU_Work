package task_Home_Work.com.dinar.lesson7;

public class ArrayExample {
    public static void main(String[] args) {

        int value = 10;

        int [] value1 = {1,2,4,5,4,3};
        System.out.println(value1[2]);

        value1[2] = 17;

        System.out.println(value1[2]);
        System.out.println();


        int[] value2 = new int[10];
        value2[3] = 13;
        value2[6] = 17;

        for (int i = 0; i < value2.length; i++ )
        {
            System.out.println(value2[i]);
        }

    }
}
