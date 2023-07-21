package streamApiPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program5 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        Collections.addAll(animals,"Elephant", "Mouse","Lion", "Tiger", "bear","hourse");
        animals.stream().filter(c -> c.length() < 8).sorted().forEach(s -> System.out.println(s));
    }
}
