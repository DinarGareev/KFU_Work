package oop9;

public class PersonProgram {
    public static void main(String[] args) {                                //
        Person sergey = new Person("Sergey ", " qwerty007");  // создаем экземпляр класса Person, и передадим ему два аргумента
        sergey.displayPerson();                                             // далее обратимся к отображения нашего метода
        sergey.account.displayAccount();                                    //
    }
}
