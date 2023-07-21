package oop9;               // Обьекты внутреннего класса могут быть созданы только в том классе в котором эти внутренние классы определены
                            // а в других внешних классах объекты внутреннего класса создать нельзя
public class Person {
    private String name;                                                          //1.Сначало создаем переменную для имени
                                                                                  //
    Account account;                                                              //Далее создаем экземпляр класса Account для дальнейшей работы с классом Account
    Person(String name, String password){                                         //Тут мы говорим, что внутри нашего конструктора в качестве аргумента нашему Person должны приходить два значения - имя и пароль
        this.name = name;                                                         //как работаем с именем все понятно,тут мы говорим, что name который пришел в качестве аргумента, и с помощью ключевого слова this связываем его с нашей переменной
        account = new Account(password);                                          //Тут мы классу экземпляру класса создаем место в памяти и говорим что ему в качестве аргумента приходит password
    }                                                                             //Т.е когда мы будем вызывать наш конструктор Person мы ему в качестве аргумента передали имя и пароль, и этот пароль приходит в качестве аргумента
                                                                                  //нашему экземпляру класса,класса Account.
    public void displayPerson(){ //метод для отображения                          //3. И чтобы у нас был из одного класса был доступ к другому классу , мы обращаемся к нашему классу account и вызываем у него соответствующее поле account.password
        System.out.println(name + account.password);                              //
    }                                                                             //
                                                                                  //
    public class Account{                                                         //
        private String password;                                                  //
                                                                                  //
        Account(String pass){                                                     //2.Далее мы перелетаем к классу Account, ему в качестве аргумента передали пароль pass пришел отсюда account = new Account(password);и с помощью ключевого слова this связываем его с нашей переменной
            this.password = pass;                                                 //и с помощью ключевого слова this даем ему ссылку на нашу переменную  private String password  которую мы создали внутри нашего класса Account
        }                                                                         //
        void displayAccount(){                                                    //
            System.out.println(Person.this.name + " " + password);                //4.чтобы вызвать переменную которая являестя переменной внешнего класса, мы должны обратиться не только к классу,
        }                                                                         //  а мы должны вызвать ключевое сово this которая предоставит нам ссылку на переменную внешнего класса
    }
}
