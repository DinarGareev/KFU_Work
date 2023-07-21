package collections;

import java.util.ArrayDeque;

public class ProgramObjectDeque {
    public static void main(String[] args) {
        ArrayDeque<Person> people = new ArrayDeque<>();
        people.addLast(new Person("Sergey"));    //сказать явно что я создаю Person
        people.addFirst(new Person("Anton"));    //сказать явно что я создаю Person
        for (Person person:people) {
            System.out.println(person);

        }
    }
}
    class Person{
        private String name;
        public Person(String value){
            name = value;
        }

        String getName(){
            return name;
        }
    }

