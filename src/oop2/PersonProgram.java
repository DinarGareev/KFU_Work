package oop2;

public class PersonProgram {
    public static void main(String[] args) {
        Person sergey = new Person("Sergey",22);
        System.out.println(sergey.getAge());
        sergey.setAge(-12);
        System.out.println(sergey.getAge());
        sergey.setAge(35);
        System.out.println(sergey.getAge());
        sergey.setAge(123588);
        System.out.println(sergey.getAge());
        System.out.println("-------------");
        Person alla = new Person("Alla", 26);
        System.out.println(alla.getAge());
        alla.setAge(18);
        System.out.println(alla.getAge());
        alla.setAge(35);
        System.out.println(alla.getAge());
        alla.setAge(123588);
        System.out.println(alla.getAge());
    }
}
