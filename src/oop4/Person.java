package oop4;

public class Person {
    private int id;
    static int counter;

    static {  // создали статический инициализтор, внутри него положили изначальные значения counter с которого все будет начинаться
        counter = 0;
        System.out.println("Это инициализатор"); //т.е это выполняется для всех конструкторов
    }
    Person(){
        id = counter++;  //дальше увеличили значение counter присвоили его id // значение id при создании новых экземпляров класса увеличивается на 1
        System.out.println("Это конструктор"); // и сказали что это конструктор
    }
    public void displayId(){
        System.out.println(id);
    }

}
