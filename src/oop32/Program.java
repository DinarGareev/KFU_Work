package oop32;

public class Program {
    public static void main(String[] args) {
        Person sergey1 = new Person("Sergey1");
        Person sergey2 = new Person("Sergey2");
        System.out.println(sergey2.equals(sergey1));
        Person sergey3 = new Person("Sergey1");
        System.out.println(sergey1.equals(sergey3)); //sergey1 = "Sergey1"ж  sergey3 = "Sergey1"
    }
}
