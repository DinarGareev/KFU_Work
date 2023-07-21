package streamApiPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Program12 {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.addAll(Arrays.asList(new Animal[]{
                new Animal("Elephant ", 120),
                new Animal("Mouse ", 80),
                new Animal("Lion ", 90),
                new Animal("Tiger ", 100),
                new Animal("bear ", 30),
                new Animal("hourse ", 20)}));
        Animal min = animals.stream().min(Animal::compare).get();
        Animal max = animals.stream().max(Animal::compare).get();
        System.out.println(min.getPrice()+min.getName());
        System.out.println(max.getPrice()+max.getName());
    }
}
