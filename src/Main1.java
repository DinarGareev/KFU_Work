import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int num1 = 12;
        double num2 =12.5;
        char symbol = '!';
        boolean n1 = true;
        boolean n2 = true;
        String stroka = "dfdfdf";


        //System.out.println("Введите число:");
        //Scanner scanner = new Scanner(System.in);
        //int number1 = scanner.nextInt();    //хотим значение которое вводим с консоли было int, тогда добавляем nextInt()
        //System.out.println("Вы ввели число:  " + number1);
//
        //System.out.println("Введите число:");
        //double number2 = scanner.nextDouble();   //хотим значение которое вводим с консоли было int, тогда добавляем nextInt()
        //System.out.println("Вы ввели число:  " + number1);


        int a =12;
        int b =14;
        // первый способ
        //System.out.println(a);
        //System.out.println(b);
        //второй способ
       //System.out.println(a + "" + b);
       //System.out.printf("a = %d \n b = %d", a, b); //  %d - это у нас спецификатор,типо замена типа данных
       ////%f - для дробных
       // \n - переход на новую строку
       //System.out.println();
       //String str1 = "Здорова";
       //String str2 = "Привет";
       //System.out.printf("str1 = %s \n str2 = %s", str1, str2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = scanner.nextLine(); //
        System.out.println("Вы ввели строку: " + text);

        System.out.println("Введите целую строку до пробела:");
        String text1 = scanner.next(); //
        System.out.println("Вы ввели строку: " + text1);

        System.out.println("Введите целую строку с пробелом:");
        String text2 = scanner.nextLine(); //
        System.out.println("Вы ввели строку: " + text2);


    }
}
