package collections;

import java.util.HashSet;

//метод HashSet таблица с уникальными эл-мы. Если попытаюсь добавить эл-т кот-ый есть то он его уже не добавит
// неотсартированный
public class ProgramHashSet {
    public static void main(String[] args) {

        HashSet<String> animals = new HashSet<>();
        animals.add("Lion");
        animals.add("Rabbit");
        animals.add("Bear");

        boolean isAdded = animals.add("Mouse");
        boolean isAdded1 = animals.add("q");   //
        System.out.println(isAdded);
        System.out.println(isAdded1);
        System.out.println(animals);           //[Mouse, Lion, Rabbit, qwerty, Bear]

        animals.remove("Lion");
        System.out.println(animals);
        animals.removeAll(animals);
        System.out.println(animals);
    }
}
