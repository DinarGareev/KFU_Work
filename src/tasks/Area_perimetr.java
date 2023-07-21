package tasks;

import java.util.Scanner;

public class Area_perimetr {
    //нужно наисать программу который принимает два числа, ширина и длина. Оба значения вводятся с консоли.
    // Нужно посчитать периметр и площадь, и вывести результат на печать.

    public static void main(String[] args) {
        //формула периметра
      //  int perimetr = (a+b)*2;

        //формула площади
       // int s = a*b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();

        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        int perimetr = (a+b)*2;
        int s = a*b;
        System.out.println("Периметр: " + (a+b)*2);
        System.out.println("Площадь: " + s);
    }
}
