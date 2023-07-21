package oop16;

public class Person {
    private String name;

    public String getName() { //метод для получения имени
        return name;
    }
    public Person(String name){
        this.name = name;
    }

    public void display(){
        System.out.println(name);
    }

}
