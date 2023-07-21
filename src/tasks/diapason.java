package tasks;

import java.util.Scanner;

public class diapason {
    // вводится число от 1 до 9 включительно, нужно вывести последовательность умножения для этого числа.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводим число: ");
        int namber1 = scanner.nextInt();
        System.out.println("последовательность умножения на числа от 1 до 9: ");
        for (int i = 1; i <= 9; i++){
            System.out.println("Умножение на "+i+": равно: " +namber1 * i);
        }

    }
}
