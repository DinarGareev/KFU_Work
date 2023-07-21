package oop22;

public class Magazin implements Printable{

    private String name;

    String getName(){
        return  name;
    }

    Magazin(String name){
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println(name);
    }
}
