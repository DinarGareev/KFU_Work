package oop10;

public class Person {
    //Особенности внутреннего класса заключается в том что их можно определить внутри любого контекста(внутри цикла, метода и т.д)
    private String name;
    Person(String name){
        this.name = name;
    }

    public void setAccount(String password){                         //создаем метод setAccount, в качестве аргумента принимает пароль
        class Account{                                               // внутри метода создадим класс Account
            void display(){
                System.out.println(name+" "+password);
            }                                                        // внутри класса создади sout. Тут метод поработает с name который есть внутри нашего конструктора, и с password
        }                                                             //который приходит к нам в качестве аргумента для нашего метода

        Account account = new Account();                              // теперь создадим экземпляр класса
        account.display();                                            // далее вызываем метод display
    }                     //account.display(), так мы вызвали метод. Тут мы обращаемся к имени. Имя нам придет когда мы его передадим внутрь нашей программы
}                         // а пароль придет в качестве аргумента
