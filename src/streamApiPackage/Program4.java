package streamApiPackage;



import java.util.stream.Stream;

public class Program4 {
    public static void main(String[] args) {
        Stream<Animal> animalStream = Stream.of(new Animal("Elephant ", 120),
                new Animal("Lion ", 120),
                new Animal("Mous ", 120)); // объект типа Animal



        animalStream.map(n ->"Животное: " + n.getName() +"Цена: " +  n.getPrice()).forEach(s -> System.out.println(s));
    }
}
