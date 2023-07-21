package oop5;

public class PersonProgram {
    public static void main(String[] args) {
        Person.displayCounter();

        Person sergey1 = new Person();
        Person sergey2 = new Person();
        Person sergey3 = new Person();
        Person sergey4 = new Person();

        Person.displayCounter();
        sergey4.displayId();   //почему выводит в ответе 3?????

    }
}
