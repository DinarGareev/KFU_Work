package oop16Home16;

public class Emploee extends Person{
    private String company;

    public String getCompany() {
        return company;
    }


    public Emploee(String name, String company){
        super(name);
        this.company = company;
    }

    public void display(){
        System.out.println(super.getName()+" "+company);
    }

}
