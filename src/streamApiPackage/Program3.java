package streamApiPackage;

import java.util.ArrayList;
import java.util.Collections;

public class Program3 {
    public static void main(String[] args) {
        ArrayList <String> cities = new ArrayList<>();
        Collections.addAll(cities,"Казань", "Москва" , "Елабуга");
        cities.stream().filter(l -> l.length() == 6).forEach(l -> System.out.println(l));
    }
}
