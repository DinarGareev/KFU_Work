package oop16;

public class Client extends Person {
    private int sum;
    private  String bank;
    public Client(String name,String bank, int sum){
        super(name); // получаем значени из родительского источника
        this.bank = bank;
        this.sum = sum;
    }

    public void display(){
        System.out.println(super.getName()+" " + bank+" "+sum);
    }

    public String getName() {      // Для чего нам этот метод если и без него все работает
    return super.getName();
    }

    public String getBank() {
        return bank;
    }
    public int getSum(){
        return sum;
    }


}
