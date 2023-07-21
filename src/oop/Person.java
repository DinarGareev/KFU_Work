package oop;

class Person {

    String name;
    int age;

    {
        name = "undefined";
        age = 27;
    }
    Person(){

    }
    Person(String n){
        this.name = n;
    }
    Person(String n, int a){
        this.name = n;
        this.age = a;
    }
    void info(){
        System.out.printf("Меня зовут %s \t  Мне %d \n  ", name,age);
    }
}
