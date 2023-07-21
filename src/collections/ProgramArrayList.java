package collections;

import java.util.ArrayList;
// для работы с индексами
public class ProgramArrayList {
    public static void main(String[] args) {
        ArrayList <String> people = new ArrayList<>();  //добавили коллекцию, и добовляем параметризацию
        people.add("Sergey");
        people.add("Andrey");
        people.add("Anton");
        people.add("Lisa");
        people.add(2,"qwerty");   //добавление в список add
        System.out.println(people.get(3));
        System.out.println(people);

        for (String person:people) {
            System.out.println(person);
        }
        people.remove(0);              //удаление из списка по индексу
        people.remove("Andrey");
        System.out.println(people);
        System.out.println(people.get(0));

        int peopleCount = people.size();   // метод size для получения количества элементов
        System.out.println(peopleCount);

        ArrayList<String> animals = new ArrayList<String>(); // В круглых скобках указывается кол-во элементов, если нам нужно конечно указывать количество элементов
    }



}
