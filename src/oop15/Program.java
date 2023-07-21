package oop15;

public class Program {
    public static void main(String[] args) {
        //создание объекта класса Rectangl
        Rectangl rectangl = new Rectangl(12,12,10, 15);
        rectangl.getArea();
        rectangl.getPerimetr();
        System.out.println(rectangl.getArea());
        System.out.println(rectangl.getPerimetr());

    }
}
