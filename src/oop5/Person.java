package oop5;
// не сможем значение статического инициализатора изменить но сможем прочитать
public class Person {
    private int id;
    private static int counter = 0; //добавили статик модификатор привате

    Person(){
        id = counter++;
        System.out.println("Это конструктор");
    }
    public static void displayCounter(){ // метод для просмотра counter
        System.out.println(counter);
    }
    public void displayId(){   // Для чего это метод???
        System.out.println(id);
    }

}

