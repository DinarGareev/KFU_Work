package oop1;

public class Person {

    String name;
    private String surname;
    public String patronomic;
    protected int age;

    public  Person(String name,String surname,String patronomic,int age){  //внутрь конструктора что то приходит
        //укажем на них ссылки,
        this.name = name; // т.е мы говорим что имя которое будет приходить, будеть вставать вместо переменной указанных в поле
        this.surname = surname;
        this.patronomic = patronomic;
        this.age = age;

        // Создали конструктор для класса Person внутри которго передали в качестве аргумента значения которые будем передавать и
        // указали ссылки с помощью ключевого слова this
    }
    public void displayName(){
        System.out.println(name);
    }
     void displayAge(){
        System.out.println(age);
    }
    private void displaySurname(){
        System.out.println(surname);
    }
    protected void displayPatronomic(){
        System.out.println(patronomic);
    }

    //Написали 4 метеда с разными модификаторами доступа

}
