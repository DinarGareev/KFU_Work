package oop01.dinar.lesson2;

public class Programm {
    public static void main(String[] args) {

        Ram ram = new Ram(123);
        Ssd ssd = new Ssd(456);
        Computer computer = new Computer(ram, ssd);
        computer.print();
    }

}
