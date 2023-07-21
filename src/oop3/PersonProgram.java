package oop3;

public class PersonProgram {
    public static void main(String[] args) {
        //Создадим двух человек, выделим для нее память
        Person sergey1 = new Person();
        Person sergey2 = new Person();
        //вызовим displayId
        System.out.println(Person.counter); // Почему тут counter будет равен 2
        sergey1.displayId();
        sergey2.displayId();

        System.out.println(Person.counter);

        Person.counter = 10;

        Person sergey3 = new Person();
        sergey3.displayId();  // почему при создании сразу не увеличился на 1

        Person sergey4 = new Person();
        sergey4.displayId();
        // не совсем понял откуда берутся ответы
    }
}
