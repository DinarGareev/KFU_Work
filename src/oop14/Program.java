package oop14;
//будем создавать наши обьекты, тут будем обращаться к наследованным абстрактным классам
public class Program {
    public static void main(String[] args) {
        Emploe sergey = new Emploe("Sergey", "IIIS");
        sergey.display();

        Client anton = new Client("Anton","IIIS");
        anton.display();
    }

}
