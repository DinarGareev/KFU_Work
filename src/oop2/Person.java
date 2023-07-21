package oop2;
//Будем работать с методами которые будут устанавливать и возвращать значения этих полей. Методы сет будут изменять эти поля
// а методы гет будут получать значения которые лежат внутри поля
public class Person {
    //Создали две переменные с приватным модификатором доступа,т.е доступ будет к нему только из этого класса
    private String name;
    private  int age = 22;

    //Создадим конструктор
    public Person(String name, int age){
        setName(name);
        setAge(age);
    }
    //Создадим методы, которы будут передавать в public Person какие то параметры

    public String getName(){
        return this.name;
    }
    public void setName(String name){ //Установка данных/В сетах приходит в качестве аргумента
        this.name = name;
    }
    public int getAge(){  //передача данных
        return this.age;
    }
    public void setAge(int age){
        if ((age>0) && (age<100)){
            this.age = age;
        }
    }
}
