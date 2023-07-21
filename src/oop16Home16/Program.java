package oop16Home16;


public class Program {
    public static void main(String[] args) {

        Person person = new Person("Sergey");
        person.display();
        Person person1 = new Client("Sergey", "233", "VTB"); //Супер классом является Person, а его подклассом Client
        person1.display();
        Person person2 = new Emploee("Sergey", "GKS");         //Супер классом является Person, а его объектом подклассом Emploee
        person2.display();




    }
}
