package oop32;
//рассмотрим оператор сравнения
public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }

    //метод который будет проверять на сравнение объектов
    @Override
    public  boolean equals(Object object){   //
        if (!(object instanceof Person))     //instanceof - выясняет яфвл=ся объект который мы передали объектом кдасса Person
            return false;                    //
        Person person = (Person) object;     //  (Person) object - значение лежит внутри объекта
        return this.name.equals(person.name);//
    }
}
