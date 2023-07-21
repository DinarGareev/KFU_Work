package oop21homeWork;

public class Book implements Printabale{
    String name;
    String author;

    Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println(name+" "+author);
    }
}
