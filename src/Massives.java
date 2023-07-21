public class Massives {
    public static void main(String[] args) {
        //Инициализируем массив
        int nums1[];
        int[] nums2; // массив интов для переменной
        // указываем из скольки элементов состоит наш массив
        nums1 = new int[4]; // индексация массива начинается с нуля

        //Первый способ задания значений в массиве
        int nums3[] = new int[] {1,2,3,4};
        //Второй способ задания значений в массиве
        int[] nums4 = {1,2,3,4};  //массив интов для num4
        //Третий способ задания значений в массиве
        int nums5[] = new int[4]; //
        nums5[0] = 1;
        nums5[1] = 2;
        nums5[2] = 3;
        nums5[3] = 4;
        System.out.println(nums5); // тут распечатаеся адрес памят


        System.out.println(nums5[2]); //явно укажем индекс который хотим распечатать, путь до выделенной памяти
        //обращаемся к участку памяти для которого выделяем место

        int nums4_lenght = nums4.length;  //обращаемся к nums4 и вызываем функцию lenght (указывает кол-во эл-ов)
        System.out.println(nums4_lenght);

        //Одномерный массив
        int[]nums6 = new int[]{1,2,3,4,5,6};
        //Многомерный массив
        int[][]nums7 = {{1,2,3,4},{5,6,7,8}}; //Запятая показ-ет м/у {} отделение элемента

        nums7[0][0] = 123; // перезаписали на место с индексом 0,0 число 123 (положили в ячейку другое число)
        System.out.println(nums7[0][0]);

        System.out.println();

        int[] arr = new int[]{10,2,3,4,5,6,7};
        for (int i = 0; i < arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        for (int i: arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        int nums8[][] = new int[][]
                {
                        {12,2,33},
                        {4,53,6},
                        {7,854,90}
                }; // двумерная мтрица 3 на 3

        for (int i = 0; i <nums8.length; i++) {//первым пройдемся по горизонтали, вторым по вертикали
            System.out.println("Это длина"+nums8.length);
            for (int j = 0; j < nums8[i].length; j++)
            {
                System.out.println("Это длина nums8[i] "+nums8[i].length+" ");
                System.out.print(nums8[i][j] + " ");
            }
        }

    }
}
