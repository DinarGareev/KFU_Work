package oop17;

public class Magazin implements Printable{
    private String company;

    public String getCompany() {
        return company;
    }

    Magazin(String company){
        this.company = company;
    }

    @Override
    public void Print() {
        System.out.println(company);
    }
}
