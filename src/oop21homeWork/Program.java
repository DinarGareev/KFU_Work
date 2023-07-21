package oop21homeWork;

public class Program {
    public static void main(String[] args) {
        Printabale printabale = readPrintabale("Hello", true);
        printabale.print();
        read(new Book("Garri Potter", "Dj.Rolling"));
        read(new Magazin("Cars"));

    }

    static Printabale readPrintabale(String name, boolean option){ // почему Printabale
        if (option){
           return new Book(name,"undefined");
        }
        else {
            return new Magazin(name);
        }
    }
    static void read(Printabale printabale){
        printabale.print();
    }

}
