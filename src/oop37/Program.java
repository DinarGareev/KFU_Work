package oop37;

public class Program {
    public static void main(String[] args) {
        Printer printer = new Printer();
        String[] names = {"Julia","Sergey", "Vladimir", "Anton"};//создали массив
        Integer[] numbers = {33,455,66,77,44};
        printer.<String>print(names);
        System.out.println();
        printer.<Integer>print(numbers);
    }
}
