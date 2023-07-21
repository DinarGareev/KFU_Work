package oop17;

public class Program {
    public static void main(String[] args) {

        Book sergey1 = new Book("Garri Potter", "Dj.Rolling");

        sergey1.Print();

        Printable sergey2 = new Magazin("Home book");
        sergey2.Print();



        // для чего нам через преобразование типов получать данные, не совсем понял. Если мы через объекты получаем тоже самое

        String name = ((Magazin)sergey2).getCompany();
        System.out.println(name);



    }
}
