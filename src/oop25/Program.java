package oop25;
//
public class Program {
    public static void main(String[] args) {
        Book book1 = new Book("Ise and Fire", "J.Martin", Type.PHANTASY);//обьект книги создали
        System.out.println(book1.name+" "+book1.author+" "+book1.bookType);

        switch (book1.bookType){
            case SCIENCE:
                System.out.println("Это научный жанр");
                break;
            case PHANTASY:
                System.out.println("Это жанр фэнтэзи");
                break;
            case TECHNICAL:
                System.out.println("Не лезь сюда");
                break;
        }

    }
}
