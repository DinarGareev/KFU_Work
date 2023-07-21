package streamApiPackage;

import java.util.Comparator;
import java.util.stream.Stream;

public class Program6 {
    public static void main(String[] args) {
        Stream<Animal> animalStream = Stream.of(
                new Animal("Elephant ", 120),
                new Animal("Mouse ", 80),
                new Animal("Lion ", 90),
                new Animal("Tiger ", 100),
                new Animal("bear ", 30),
                new Animal("hourse ", 20));
        animalStream.sorted(new AnimalComparator()).forEach(s -> System.out.println(
                "Имя: " + s.getName() + "Стоимость: " + s.getPrice()));
    }
}

    class AnimalComparator implements Comparator<Animal>{

        @Override
        public int compare(Animal animal1, Animal animal2) {
            return animal1.getName().toLowerCase().compareTo(animal2.getName().toLowerCase());
        }
    }

