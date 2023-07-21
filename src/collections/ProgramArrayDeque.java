package collections;

import java.util.ArrayDeque;
// массив очереди
public class ProgramArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String > animals = new ArrayDeque<String>();
        animals.add("Elephant");
        animals.addLast("Tiger");
        animals.add("Lion");
        animals.addFirst("Bear");                      //позволяет поставить на первую позицию элемент
        System.out.println(animals);
        System.out.println(animals.getFirst());          //getFirst
        System.out.println(animals.getLast());          //getLast
        System.out.println("---------------");
        for (String animal:animals){
            System.out.println(animal);
        }
        System.out.println("---------------poll");      // забираем и не возвращаем его в очередь
        System.out.println(animals.pollFirst());

        System.out.println("---------------pick");      // забираем и  возвращаем его в очередь
        System.out.println(animals.peek());

        System.out.println("---------------remove");      // удаляем первый элемент
        System.out.println(animals.removeFirst());

        System.out.println("---------------");

        while (animals.peek()!=null){                   // peek
            System.out.println(animals.pop());          // pop
        }
    }
}
