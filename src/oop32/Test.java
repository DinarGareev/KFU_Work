package oop32;

public class Test {
    public static void main(String[] args) {
        //сравним примитывы
        String s1 = new String("qwerty");
        String s2 = new String("qwerty");
        System.out.println("1------------------");
        System.out.println(s1 == s2);        //сравнение ссылок(разные объекты)
        System.out.println(s1.equals(s2));   //проверяет равенство самих строк(содержание), не важно где лежат переменные
        System.out.println("2------------------");
        String s5 = s2;   // указываем ссылку на с2, с5 говорим бери значение которое лежит ы с2
        System.out.println(s5==s2);
        System.out.println(s5.equals(s2));
        System.out.println(s5==s1);
        System.out.println(s5.equals(s1));
        System.out.println("3------------------");
        String s3 ="qwerty";
        String s4 = "qwerty";
        System.out.println(s3==s4); //находится в одном и том же участке памяти
        System.out.println(s3.equals(s4));
        System.out.println("4------------------");
        String s6 = s3;
        System.out.println(s6==s3);
        System.out.println(s6.equals(s3));
        System.out.println(s6==s4);
        System.out.println(s6.equals(s4));
    }
}
