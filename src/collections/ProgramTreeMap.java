package collections;

import java.util.Map;
import java.util.TreeMap;
// TreeMap - выступет в качестве дерева
public class ProgramTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> animals = new TreeMap<>();
        //положим по нашим ключам животных
        animals.put(12,"Bear");
        animals.put(15,"Mouse");
        animals.put(1,"Fox");
        animals.put(2,"Crocodile");

        System.out.println(animals);

        System.out.println(animals.get(12));

        Map<Integer,String> afterMap = animals.tailMap(2);
        System.out.println(afterMap);


        Map<Integer,String> beforeMap = animals.headMap(2);
        System.out.println(beforeMap);

    }
}
