package oop8;


public class PersonProgram {
    public static void main(String[] args) {

        Person sergey = new Person("Sergey");
        System.out.println(sergey.getName());
        changePerson(sergey);
        System.out.println(sergey.getName());

    }

    static void changeName(Person p){
        p.setName("Anton");
    }

    static void changePerson(Person p){  // как вызвать его на печать???????????
        p = new Person("Alla");
        p.setName("Albert");
    }
}
