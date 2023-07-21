package oop01.dinar.lesson2;

public class Computer {
    private Ram ram;
    private  Ssd ssd;

    Computer(Ram ram, Ssd ssd){
        this.ram = ram;
        this.ssd = ssd;
    }

    public void print(){
        System.out.println(ram.getValue() + ssd.getValue());
    }
}
