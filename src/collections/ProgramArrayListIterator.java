package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ProgramArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Bear");
        animals.add("Lion");
        animals.add("Mouse");
        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
