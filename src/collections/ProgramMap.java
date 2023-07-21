package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//HashMap
public class ProgramMap {
    public static void main(String[] args) {
        Map<Integer,String> animals= new HashMap<>();  // generici считываются в тот момент когда создаем, поэтому после HashMap не обязательно ставить
        //Map родитель
        //Map работает только с уникальными элементами
        // В Map все строится относительно ключа
        // последовательность строится от ключей, по нарастающей
         animals.put(1,"Lion");
         animals.put(2,"Mous");
         animals.put(3,"Crocodile");
         animals.put(4,"Bear");

         //по ключу получим достум к элементу в котором он лежит,
        System.out.println(animals.get(2));

        //обратимся к ключам
        Set<Integer> keys = animals.keySet();
        System.out.println(keys);

        //
        Collection<String> values = animals.values();
        System.out.println(values);

        //замена одно эл-а на другой
        animals.replace(2,"Duck");
        System.out.println(animals);

        //Map.Entry<K,	V>	представляет	объект	с	ключом	типа	K	и значением	типа	V
        //метод	entrySet()	возвращает	набор	всех	элементов	в	виде	объектов	Map.Entry<K, V>
        for (Map.Entry<Integer,String> animal:animals.entrySet()) {
            System.out.println(animal);
        }

        System.out.println(animals.get(4).hashCode());
        System.out.println(animals.get(2).hashCode());

        //удаление
        animals.remove(3);
        System.out.println(animals);

        //size():	возвращает	количество	элементов	коллекции
        System.out.println(animals);
        System.out.println(animals.size());

        //очищает	коллекцию
        animals.clear();
        System.out.println(animals);

        //containsKey - возвращает	true,	если	коллекция	содержит	ключ	k. работает с ключами
        System.out.println(animals.containsKey(0));

        //containsValue - возвращает	true,	если	коллекция	содержит	значение, работает со значением
        System.out.println(animals.containsValue("Value"));

        Map<String, Person1> people = new HashMap<>();
        people.put("1234", new Person1("Sergey"));
        people.put("1235", new Person1("Anton"));
        people.put("1236", new Person1("Lisa"));

        System.out.println(people);
        for (Map.Entry<String,Person1> human:people.entrySet()) {
            System.out.println(human.getKey()+ human.getValue().getName() +human.hashCode());
        }

        System.out.println("----------------");
        people.remove("1234");
        for (Map.Entry<String,Person1> human:people.entrySet()) {
            System.out.println(human.getKey()+ human.getValue().getName() +human.hashCode());
        }
    }

    public static class Person1 {
        private String name;

        public  Person1(String value){
            name = value;
        }

        public String getName() {
            return name;
        }
    }
}
