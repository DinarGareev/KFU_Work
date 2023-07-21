package collections;

import java.util.LinkedList;

//связанный список
public class ProgramLinkedList {
    public static void main(String[] args) {

    LinkedList<String> animals = new LinkedList();
    animals.add("Lion");
    animals.addLast("Bear");
    animals.addFirst("Lama");
    animals.add("Rabbit");

    animals.add(1,"Mous");
        System.out.println(animals);

        System.out.println(animals.get(0));   //обращаемся по индексу и распечатываем

        if (animals.contains("Lion")){        // метод говорит о том есть ли этот элемент в списке
            System.out.println("Лев есть");
        }
        animals.remove();
        animals.remove("Sergey");
        animals.remove(1);
        animals.removeFirst();
        animals.removeLast();
        System.out.println(animals);

}
}
