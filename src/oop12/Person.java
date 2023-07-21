package oop12;

//НАСЛЕДОВАНИЕ - c помощью него мы можем расширять наш функционал для уже описанных нами классов за счет добавления какой то новой логики.
//Мы можем нашу логику расширить, либо изменить старое

public class Person {
    String name;
    public String getName(){
        return name;
    }

    public Person(String name){
        this.name = name;
    }

    public void display(){
        System.out.println(name);
    }
}
