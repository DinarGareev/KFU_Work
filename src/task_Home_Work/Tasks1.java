package task_Home_Work;

import java.util.Scanner;

public class Tasks1 {
    // 1. Дано целое число. Определить, является ли последняя цифра этого числа - цифрой 3
    public static void main(String[] args) {
       // int value = 3;
       // System.out.println(value%10);
       // if (value%10 == 3){
       //     System.out.println("Последняя цифра является 3");
        //}



/* Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
Вывести это число, добавив к нему слово "рубль" в правильном падеже ("Рубль", "рублей", "рубля")
*/
        // 1 рубль = !=11
        // 2 рубля = !=1,11,

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int chislo = scanner.nextInt();

      if (chislo % 10 == 1 && chislo % 100 != 11 && chislo % 10 != 11)
      {
          System.out.println(chislo+" рубль");
      }
      else if ((chislo % 10 == 2 || chislo % 10 == 3 || chislo % 10 == 4) && !(chislo%100==14 || chislo%100==12 || chislo%100==13)) {
          System.out.println(chislo+" рубля");
      }else  System.out.println(chislo+ " рублей");







    }
}
