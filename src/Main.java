public class Main {
    public static void main (String[] args) {
        //пояснение для кода
       /* System.out.println("Привет мир  ");
        System.out.println("Привет друг");  */

        //int целочисленный тип данных
        int number; //проинецилизировали переменную (number цел-ая переменная)
        number = 2;
       // System.out.println(number);

        // double - дробное значение
        double num1 = 12.5;
       // System.out.println(num1);

        // String - строки (класс внтри java)
        String stroka = "dfffgdgdg";
       // System.out.println(stroka);
        System.out.println("stroka");

        // char - символьный тип данных/ в char используем только один символ
        char ch1 = '\'';
        System.out.println(ch1);

        boolean b1 = true;
        boolean b2 = false;
       // System.out.println(b1);
       // System.out.println(b2);

        //var - ключевое слово которое ставится чтобы не задумываться о типах данных
        var x = 0;
        var y = "вап";
        var z = true;
       // System.out.println(x);
       // System.out.println(y);
       // System.out.println(z);

        int num2 = 10;
        num2 += 7;
        num2 = num2 + 7;
      //  System.out.println(num2);

        final int LIM = 10000;
        // System.out.println(LIM);
       // LIM += 5;

        // int -  -2147483648 до 2147483647
        // int -  4 - байта данных, 32 - бита
        int bignumber = 2147483647;
        //byte - целочисленный тип данных
        //byte - занимает в памяти 1 байт
        //byte -  от -128 до 127
        byte a = 3;
        byte b = 127;

        // short тип данных целочисленный тип данных, занимает 2 байта
        // от -32768 до 32767
        short q = 32767;

        //long
        long as = 545454545545L;
        as += 18;
        System.out.println(as);

       double h = 14.31;
       double o = 14.05;
        System.out.println(o);
    }
}
