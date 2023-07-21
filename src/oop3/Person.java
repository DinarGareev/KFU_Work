package oop3;

public class Person {
    private int id;
    static int counter = 0; //статическая переменная
    //Создадим конструктор
    Person(){
        id = counter++;
    }

    //Напишем метод который будет отображать наш id
    public void displayId(){
        System.out.println(id);
    }
}
