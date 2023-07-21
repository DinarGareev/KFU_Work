package oop17;

public class Book implements Printable{
    private String name;
    private String author;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    @Override
    public void Print() {
        System.out.println(name+" "+author);
    }




}
