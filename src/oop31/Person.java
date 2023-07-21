package oop31;

public class Person {
    private String name;


    public Person(String name){
        this.name = name;
    }

    @Override
    public int hashCode(){
        return name.hashCode();  //переопредилили hashCode
    } //создали метод который будет возвращать
}
