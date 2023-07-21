package oop16;

public class Program {
    public static void main(String[] args) {
        //Восходящее преобразование
        Object sergey0 = new Person("Sergey");         //могу создать объект
        Person sergey = new Person("Sergey");
        sergey.display();
        System.out.println("--------------");

        Person company = new Emploe("Sergey","IIIS");
        company.display();
        System.out.println("---------------");

        Person client = new Client("Alla","IIIS",12);
        client.display();

        System.out.println("---------------");


        // Нисходящее преобразование - создадим от нашего экземпляра. Обращение в обратном направлении
        Object anton = new Emploe("Anton","VMK");
        Emploe emp = (Emploe) anton;
        emp.display();
        System.out.println(emp.getCompany());
        System.out.println("---------------");


        Object albert = new Client("Albert","GKS", 10);
        if (albert instanceof Emploe){   //являестя ли объект класса Object объектом(типом) класса Emploe
            Emploe emploeeAlbert = (Emploe) albert;
            emploeeAlbert.display();
        }
        else {
            System.out.println("Приведение класса невозможно");
        }
        System.out.println("---------------");


        Object albert1 = new Client("Albert","GKS", 10);
        if (albert1 instanceof Client){   //являестя ли объект класса Object объектом(типом) класса Client
            Client clientAlbert = (Client) albert;
            clientAlbert.display();
        }
        else {
            System.out.println("Приведение класса невозможно");
        }
        System.out.println("---------------");

        Object albert2 = new Client("Albert","GKS", 10);
        if (albert2 instanceof Client clientAlbert2){   //являестя ли объект класса Object объектом(типом) класса Client//
            clientAlbert2.display();
        }
        else {
            System.out.println("Приведение класса невозможно");
        }



    }
}
