package oop22;

public class Program {
    public static void main(String[] args) {
        Printable printable = createPrintable("Hello",true); // метод будет принимать оптион, и будет возврат в качестве объекта
        printable.print();
        read(new Book("Ice and Fire","J.Martin"));
        read(new Magazin("Cars"));
    }

    static Printable createPrintable(String name, boolean option){  //сюда мы передаем два значения
        if (option){
            return new Book(name,"Undefined");
        }
        else {
            return new Magazin(name);
        }
    }


    static void read(Printable printable){
        printable.print();
    }
}
