package streamApiPackage;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Это уже элементы коллекции.
// колекцию мф привели к стриму
public class Program13 {
    public static void main(String[] args) {
        //List<String> animals = new ArrayList<>();
        //Collections.addAll(animals,"Lion", "Elephant","Tiger","Cat");

        //Приведение зачения стрима к List

        //List<String> filteredAnimals = animals.stream().collect(Collectors.toList());
        //Приведение зачения стрима кSet
        //Set<String> filteredAnimals = animals.stream().collect(Collectors.toSet());

       // for (String s : filteredAnimals) {
       //     System.out.println(s);
       // }


        //Приведение зачения стрима к Map

        Stream<Animal> animalStream = Stream.of(
                new Animal("Elephant ", 120),
                new Animal("Mouse ", 80),
                new Animal("Lion ", 90),
                new Animal("Tiger ", 100),
                new Animal("bear ", 30),
                new Animal("hourse ", 20));
        Map <String,Integer> animals = animalStream.collect(Collectors.toMap(p -> p.getName(),t -> t.getPrice()));

        animals.forEach((k,v) -> System.out.println(k+" " + v));

    }
}
