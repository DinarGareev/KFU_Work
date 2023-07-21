package oop14;
//хотим чтобы эмплоии наследовал все от Person/ брал у него логику и взаимодействовал
public class Emploe extends Person {
    private String bank;

    public Emploe(String name, String company){
        super(name);
        this.bank =company;
    }

    public void display(){
        System.out.println(super.getName()+ " " + bank);
    }
}
