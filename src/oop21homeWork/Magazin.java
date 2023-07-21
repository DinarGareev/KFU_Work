package oop21homeWork;

public class Magazin implements Printabale{
    private String name;

    public String getName() {
        return name;
    }

    Magazin(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
