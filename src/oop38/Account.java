package oop38;

public class Account {
    private String id;
    private int sum;

    <T>Account(T id, int sum){
        this.id = id.toString(); // принимаем поле айд с типом Т, и превращаем в строку // локальная переменная у нас id, поэтому мы использовали  toString, чтоб вернуть строковое значение если придет инт
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

}
