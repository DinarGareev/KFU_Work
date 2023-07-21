package zakreplenie_Home_Tasks;

import java.util.Scanner;

public class tasks_massive {
    public static void main(String[] args) {
        /*
         *  На вход поступает число - это у нас кол-во чисел в массиве.
         *  Происходит заполнение этого массива числами с клавиатуры
         *  Задача: вывести сами числа и сумму чисел всех нечетных индексов в массиве
         */

      Scanner scanner = new Scanner(System.in);
        System.out.println("Введем число: ");
      int size = scanner.nextInt();
      int array[] = new int[size];

      for (int i = 0; i <size;i++)
      {
          System.out.println("Заполним массив. Введите число");
          array[i] = scanner.nextInt();
      }

        System.out.println("Ввыведем числа, веденные для заполнения массива");
      for (int i = 0; i<size;i++)
      {
          System.out.print(array[i] + "; ");
      }
      int summ = 0;
        System.out.println("Выведем сумму нечетных чисел: ");
      for (int j=1;j<size;j++){
          if (j % 2 ==0)  { j++; }
          else  { summ = array[j]+summ; j++;}

      }System.out.println(summ);









    }
}
