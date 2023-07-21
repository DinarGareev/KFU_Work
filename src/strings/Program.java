package strings;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {


        String string1 = "Hello";
        String string2 = new String("Hello");
        System.out.println(string2);
        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));  //  equals - что это вспомнить

        String string3 = new String();
        System.out.println(string3);
        string3 = "asd";
        System.out.println(string3);

        String string4 = new String(new char[]{'h','e','l','l','o'});  //говорю что хочу поместь в строку массив char(массив char преобразовать к строке) .. Массив символов преобразовали к строке  // т.е могу поместит в строку массив char
        System.out.println(string4);
        System.out.println(string4.length()); // количество элементов внутри строки

        String string5 = new String(new char[]{'h','e','l','l','o'});
        char[] string5_1 = string5.toCharArray(); // строку преобразуем к массиву char
        System.out.println(string5_1);
        System.out.println(string5_1[0]); //можем вызвать индекс т.к это массив

        String string6 = "";
        if (string6.length()==0){
            System.out.println("строка пуста");
        }
        else
        {
            System.out.println("строка что то имеет");
        }


        String string7 = " ";
        if (string7.isEmpty()){                // isEmpty - bool, определяет есть в строке что нибудь или нет
            System.out.println("строка пуста");
        }
        else
        {
            System.out.println("строка что то имеет");
        }

        String string8 = null;     //null - вообще ничего не имеет, не существует
        System.out.println(string8);

        //стринг работает с областью памяти, а если говорим null
      /*  if (string8.length()==0){                // к null мы обратиться не можем
            System.out.println("строка пуста");
        }
        else
        {
            System.out.println("строка что то имеет");
        }   */

       // String string9 = new String();
       // string9 = null;
       // System.out.println(string9);


        String string10 = "Hello";
        String string11 = "World";
        System.out.println(string10 + " " + string11);

        String string12 = "Hello" + true;  // внутрь строки при обьединении с каким то элементом мы можем дописать строку
        System.out.println(string12);      // это можно сделать из за метода внутри стринг -   //valueOff - метод
        //valueOff - метод

        String string13 = string10.concat(string11);   //concat() - позволяет присоединять строк
        System.out.println(string13);

        String string14 = String.join("@",string10,string11);    //join - позволяет перетащить второй элемент к первому и еще можем прописать разделитель
        System.out.println(string14);

        String string15 = String.join("@",string10,string11,"My","Spring");    //join - позволяет перетащить второй элемент к первому и еще можем прописать разделитель
        System.out.println(string15);

        //Предпложим надо взять подстроку в какой то строке и т.д
        String string16 = "SuperPuperHello";
        char char1 = string15.charAt(3);
        System.out.println(char1);


        //получим набор символов, поэтому надо создать массив
        int start = 1;
        int end = 4;
        char [] char2 = new char[end - start]; // указываем сколько ячеек нужно
        string16.getChars(start,end,char2,0);
        System.out.println(char2);

        // метод equals() проверяет все индексы, значения, перебирает посимвольно
        // метод equalsIgnoreCase()
        String string17 = "Hello";
        String string18 = "hello";
        System.out.println(string17.equals(string18));
        System.out.println(string17.equalsIgnoreCase(string18));


        String string19 = "Hello";
        String string20 = "Helplo";
        //regionMatches() - возвращает булевское значение
        boolean result = string19.regionMatches(3, string20,4,2);
        System.out.println(result);

        String string21 = "Hello world";
        int num1 = string21.indexOf('l'); // находит индекс первого вхождение подсроки в строку
        int num2 = string21.lastIndexOf('l'); // находит индекс послднего вхождение подсроки в строку

        int num3 = string21.indexOf("lo"); // находит индекс первого вхождение подсроки в строку
        int num4 = string21.lastIndexOf("lo"); // находит индекс послднего вхождение подсроки в строку

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);


        System.out.println("------------------");

        String string22 = "Gordeev";
        String string23 = "Goncharov";
        String string24 = "Govrilov";
        System.out.println("-------------------------");
       // Метод	startsWith()	позволяют	определить	начинается	ли	строка	с	определенной	подстроки,
        // а	метод	endsWith()	позволяет	определить	заканчивается	строка	на	определенную	подстрок
        boolean start1 = string23.startsWith("Goo");
        boolean end1 = string24.endsWith("ovv");
        System.out.println(start1);
        System.out.println(end1);

        String string25 = "Hello";
        String stringReplace1 = string25.replace('l','2');
        System.out.println(stringReplace1);

        String stringReplace2 = string24.replace('o','b');
        System.out.println(stringReplace2);

        string24 = stringReplace2;
        System.out.println(string24.startsWith("Gb"));

        String string26 = " Sergey ";
        String string27 = "Sergey";
        System.out.println(string26.equals(string27));
        System.out.println(string26.equalsIgnoreCase(string27));

        //Метод	trim()	позволяет	удалить	начальные	и	конечные	пробелы:
        string26 = string26.trim();
        System.out.println(string26.equals(string27));
        System.out.println(string26.equalsIgnoreCase(string27));

        // можем приводить значения к верхнему и к нижнему регистру
        String string28 = "Hello";
        String string29 = "hELLO";
        System.out.println(string28.equals(string29));
        System.out.println(string28.equalsIgnoreCase(string29));

        string28 = string28.toLowerCase(Locale.ROOT);
        System.out.println(string28);
        string29 = string29.toUpperCase(Locale.ROOT);
        System.out.println(string29);

        string29 = string29.toLowerCase();
        System.out.println(string29);

        String string30 = "Hello/my/beautiful";
        String [] string31 = string30.split("/", 3);
        for (String word:string31) {
            System.out.println(word);
        }

    }
}

