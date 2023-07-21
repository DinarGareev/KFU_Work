package collections;

import java.util.SortedSet;
import java.util.TreeSet;

//Set - позволяет работать с отсартированными элементами
// SortedSet это
//TreeSet - не позволяет создать повторяющиеся элементы
//TreeSet - внутри перед моментом вывода они сортируются. Элементы выводятся в отсартированном формате
public class ProgramSet {
    public static void main(String[] args) {
        TreeSet<String> animals = new TreeSet<>();
        animals.add("Rabbit");
        animals.add("Lion");
        animals.add("Bear");
        animals.add("Mouse");
        animals.remove("Lion");
        System.out.println(animals);

        for (String animal:animals){
            System.out.println(animal);
        }

    }
}
