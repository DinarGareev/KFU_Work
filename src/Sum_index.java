import java.util.Scanner;

public class Sum_index {
    public static void main(String[] args) {
        /*
        *  На вход поступает число - это у нас кол-во чисел в массиве.
        *  Происходит заполнение этого массива числами с клавиатуры
        *  Задача: вывести сами числа и сумму чисел всех нечетных индексов в массиве
        */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");
        int size = scanner.nextInt();
        int summa = 0;
        int array[] = new int[size];

        System.out.print("Введите число:");
        for (int i =0; i>size;i++) {
            System.out.println(i);
            array[i] = scanner.nextInt();
            System.out.println(array[i]);
        }
        System.out.print("Исходный мвссив:");
        for (int j =0; j>size;j++) {
            System.out.print(array[j]);
        }

        System.out.println();
        // Хождение по четному и нечетному индексу
        for (int j = 1; j < size; j++)
        {
            if (j%2 == 0)
            {
                j++;
            }
            else {
                summa = array[j] + summa;
                j++;
            }
        }
        System.out.println("Сумма нечетных индексов; " + summa);



    }
}
