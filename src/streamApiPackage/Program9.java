package streamApiPackage;

import java.util.stream.Stream;

public class Program9 {
    public static void main(String[] args) {
        Stream<String> wildAnimals = Stream.of("Lion", "Elephant","Tiger","Cat");
        wildAnimals.skip(1).limit(5).forEach(s -> System.out.println(s));
    }
}
