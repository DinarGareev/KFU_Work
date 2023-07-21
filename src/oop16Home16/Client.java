package oop16Home16;

public class Client extends Person{

    private String sum;
    private String bank;

    public String getSum(){
        return sum;
    }

    public String getBank() {
        return bank;
    }


    public Client(String name, String sum, String bank){
        super(name);
        this.sum = sum;
        this.bank = bank;
    }

    public void display(){ // ПОЧЕМУ ЕСЛИ Я СТАВЛЮ ДРУГОЕ ИМЯ, ОНО НЕ РАБОТАЕТ
        System.out.println(super.getName()+" "+sum+" "+bank);
    }


}
