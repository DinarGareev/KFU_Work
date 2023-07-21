package oop22;

public class Book implements Printable{

    String name;
    String author;
    Book(String name,  String author){
        this.author = author;
        this.name=name;
    }
    @Override
    public void print() {
        System.out.println(author+" "+name);
    }
}
