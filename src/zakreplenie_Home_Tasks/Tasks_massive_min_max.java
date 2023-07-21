package zakreplenie_Home_Tasks;

import java.util.Scanner;

public class Tasks_massive_min_max {
    // На вход поступает какое-то количество чисел.
    // Найти минимальное и максимальное значение.
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);  //создадим сканер для ввода значений с консоли
        System.out.println("Введите число: ");
        int size = scanner.nextInt(); //введем число с консоли
        int array[] = new int[size];  //создали массив, забронировали место в памяти, указали длину массива

        System.out.println("Пробежимся по массиву, и заполним его: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Введите число: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Снова пробежимся по массиву, и выведем хранящиеся там значения");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ;");
        }


        int [] min_max = printArray(array);

        System.out.println("Min: " + min_max[0]);
        System.out.println("Max: " + min_max[1]);

    }

     static int[] printArray(int[] array) {
         int min = array[0];
         int max = array[0];
            System.out.println();
            System.out.println("Найдем минимальное и максимальное значение");
            for (int i = 0; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
                if (max < array[i]) {
                    max = array[i];
                }

            }
            int[] res = {min,max};
            return res;

    }
}
