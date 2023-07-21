package oop14;

public class Client extends Person {
    private String bank;

    public Client(String name, String company){
        super(name);
        this.bank = company;
    }

    public void display(){
        System.out.println(super.getName()+" "+bank);
    }

}
