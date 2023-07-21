package tasks;

import java.util.Scanner;

public class Max_min {
    public static void main(String[] args) {
        // На вход поступает какое-то кол-во чисел.
        // Найти минимальное и максимальное значение


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел в массиве");
        int size = scanner.nextInt();   //переменная хранит кол-во эл-ов в массиве
        int array[] = new int[size];
        for (int i = 0; i < size;i++)
        {
            System.out.println("Введите число: ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

    //    min_max(array); // обращаемся к методу min_max
     //   average(array);
        sum_num(array);

    }

    // Метод по поиску минимального и максимального значения
    static void min_max(int array[])
    {
        int min = array[0];  // мин и мах знач приравниваем значение нулевого элемента в массиве
        int max = array[0];

        for (int i = 0; i < array.length; i++)
        {
            if (min > array[i]){
                min = array[i];
            }
            if (max<array[i]){
                max = array[i];
            }
        }
        System.out.println("Min: "+ min);
        System.out.println("Max: "+ max);
    }

// Метод по поиску среднего значения
    static void average(int array[]){
        //Напишите программу на Java,
        //        которая принимает число - количество чисел, а так же сами числа в качестве входных данных
        //        для вычисления и печати среднего числа(Сумма всех чисел деленное на их количетсво).
        //        Напишите для этой программы отдельный метод  и вызовите его в методе мейн,метод ничего не возвращает,
        //        искомый результат выводится на печать. Результат отображается с плавающей точкой,
        //        округление производится до трех знаков после запятой.
        // average - среднее

        int summa = 0; //
        double average_result = 0;

        if (array.length == 0){
            System.out.println(average_result);
        }
        else {
            for (int i = 0; i < array.length; i++) {
                summa = array[i] + summa;
            }
            System.out.println("Сумма всех введенных чисел: " + summa);

            average_result = (double) summa / (double) array.length; // с круглыми скобочками с названем типа, перед переменной, привожу тип переменной к другому типу
            System.out.println("Среднее число-Сумма всех чисел деленное на их количетсво: " + average_result);
            System.out.printf("%.3f",average_result);
        }
    }

 // Пояснение к коду: цикл будет выполняться до тех пор, пока число не станет равным 0.
 // В каждой итерации цикла происходит вычисление последней цифры числа (digit), которая прибавляется к общей сумме цифр (sumOfDigits).
    // Затем из числа удаляется последняя цифра с помощью операции деления нацело (number /= 10).

    //Метод по посчету суммы цифр введенных  чисел и вывести на печать

    static void sum_num (int array[]){
        int b = 0;

       for (int i = 0; i < array.length; i++){
        while (array[i] != 0){
            b = b + array[i]%10;
            System.out.println("1ая фаза: "+b);
            array[i] =array[i]/10;
            System.out.println("2-ая фаза: "+array[i]);
        }
           System.out.println(b);
       }
    }
}
