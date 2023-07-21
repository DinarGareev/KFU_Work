package oop31;

public class Program {
    public static void main(String[] args) {
        Person sergey = new Person("Sergey");
        System.out.println(sergey.hashCode());  // создали объект и сказали ему что хотим превратить его hashCode // когда пароль - идет сравнение хас кода а не пароля

        Person sergey2 = new Person("Sergey"); //хаш код привязывается к значению, а не к объекту, т.е хэшируем значение
        System.out.println(sergey2.hashCode());

        System.out.println();
        System.out.println(sergey2.getClass());

    }
}
