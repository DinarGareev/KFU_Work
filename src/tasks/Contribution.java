package tasks;

import java.util.Scanner;

public class Contribution {
    public static void main(String[] args) {
        // Задача по подсчету суммы вклада в банк.
        //Вводится два целых значения.
        // Первое - сумма вклада в рублях
        // Второе - количество лет, на, которое будет произведен вклад.
        // Нужно вывести итоговую сумму, которую получит клиент банка.
        // Условия для вклада:
        // 1. Минимальная процентная ставка 6%.
        // 2. Минимальное количество лет = 1 год.
        // 3. Если сумма вклада >= 1000000 рублей,то к процентной ставке добавляется 0.5%
        // 4. Если количество лет >= 7, к процентной ставке добавляется 0.4%.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести сумму вклада в рублях:");
        double summa_contribuiton_now = scanner.nextDouble();

        System.out.println();

        System.out.println("Ввести количество лет, на которое будет произведен вклад:");
        int quantiti_year_contribuiton = scanner.nextInt();

        double percent = 6; //переменная для значения процента

        if (quantiti_year_contribuiton >= 1 ) {
            percent = 6 ;
            System.out.println("Минимальная процентная ставка равна: " + percent+"%");
        } else System.out.println("Открытие вклада меньше чем на год невозможно,в связи с требованиями данного банка");

        if (summa_contribuiton_now >= 1000000 & quantiti_year_contribuiton >= 1) {
            percent = percent + 0.5;
            System.out.println("Так как сумма вклада >= 1000000 рублей, то к процентной ставке добавляется 0.5% и будет она равна: "+ percent+"%");
        }
        if (quantiti_year_contribuiton >=7 )
        {
            percent = percent + 0.4;
            System.out.println("Если количество лет вклада >= 7, к процентной ставке добавляется 0.4%. Тогда процентная ставка будет равна: "+ percent+"%");
        }

        for (int i = 1; i <=quantiti_year_contribuiton; i++)
        {
            summa_contribuiton_now = summa_contribuiton_now + summa_contribuiton_now * percent/100;
        }

        System.out.println("Выведем итоговую сумму, которую получит клиент банка: " + summa_contribuiton_now);
    }
}
