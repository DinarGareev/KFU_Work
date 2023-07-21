package oop;

public class PersonProgram {
    public static void main(String[] args) {

        Person sergey = new Person();
        sergey.info();

        Person anton = new Person("Hello");
        anton.info();

        Person samat = new Person("Andrey", 389);
        samat.info();

    }

}
