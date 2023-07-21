package streamApiPackage;

import java.util.stream.Stream;

public class Program8 {
    public static void main(String[] args) {
        Stream<String> wildAnimals = Stream.of("Lion", "Elephant","Tiger","Cat");
        Stream<String> homeAnimals = Stream.of("Mous", "Cat","Dog");
        Stream.concat(wildAnimals,homeAnimals).sorted().distinct().forEach(n -> System.out.println(n));
    }
}
