package streamApiPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Program11 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(12,21,23,435,2,23,2,34345,3,44,32,22));
        Optional <Integer> min = numbers.stream().min(Integer :: compare);
        Optional <Integer> max = numbers.stream().max(Integer :: compare);
        System.out.println(min.get());
        System.out.println(max.get());
    }
}
