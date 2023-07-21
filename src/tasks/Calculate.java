package tasks;

import java.util.Scanner;

public class Calculate {
    // На вход поступает два числа, после этого из предложенного списка требуется выбрать математическую операцию.
    // напечатав соответствующую цифру:
    //1.Сложение
    //2.Вычитание
    //3.Умножение
    //4.Деление
    //Если введено значение не из указанного диапазона, вывести сообщение: Вы неправильно выбрали знак
    // В качестве результата должен быть выведен результат математической операции
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // создаем экземпляр Scanner именем scanner =
        System.out.println("Введите первое число:");
        double number1 = scanner.nextDouble(); //
        System.out.println("Введите второе число:");
        double number2 = scanner.nextDouble();
        System.out.println("Введите третье число:");
        int number3 = scanner.nextInt();

        switch (number3){
            case 1:
                System.out.println("Сложение чисел: первое число + второе число = " + (number1+number2));
                break;
            case 2:
                System.out.println("Вычитание чисел: первое число - второе число = " + (number1-number2));
                break;
            case 3:
                System.out.println("Умножение чисел: первое число * второе число = " + (number1*number2));
                break;
            case 4:
                System.out.println("Деление чисел: первое число / второе число = " + (number1/number2));
                break;
            default:
                System.out.println("Вы неправильно выбрали знак");
        }

    }
}
