package oop21;

public class Person implements Magazin.Name {

    String name;
    Person(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
