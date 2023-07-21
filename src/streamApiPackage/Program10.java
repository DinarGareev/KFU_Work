package streamApiPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Program10 {
    public static void main(String[] args) {
        ArrayList<String> animalList = new ArrayList<>();
        animalList.addAll(Arrays.asList(new String []{"Lion", "Elephant","Tiger","Cat"}));
        System.out.println(animalList.stream().count());
//возвращает 1ый эл-т
        Optional<String> first = animalList.stream().findFirst();
        System.out.println(first.get());
//возвращает случайный эл
        Optional<String> any = animalList.stream().findAny();
        System.out.println(any.get());


    }
}
