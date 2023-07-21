package oop25;
//описание класса кники
public class Book {
    //зададим поля
    String name;
    String author;
    Type bookType; //bookType является типом перечисления
    Book(String name, String author, Type bookType){
        this.name = name;
        this.author = author;
        this.bookType = bookType;
    }
    //закинем enum И привяжем bookType, и будем использовать его для обращения к константам
}
    enum Type{
        SCIENCE,
        PHANTASY,
        TECHNICAL
}
