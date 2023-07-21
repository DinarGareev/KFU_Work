package oop16;

public class Emploe extends Person {
     private String company;
    public Emploe(String name,String company){
        super(name);
        this.company = company;
    }

      public String getCompany() {  //дЛЯ ЧЕГО НАМ МЕТОД ЭТОТ, ЕСЛИ У НАС ИМЯ БЕЗ МОДИФИКАТОРА???
        return company;
    }

    public void display() {
        System.out.println(super.getName()+" "+ company);
    }

}
