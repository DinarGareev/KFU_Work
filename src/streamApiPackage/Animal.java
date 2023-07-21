package streamApiPackage;

public class Animal {
    private String name;
    private int price;

    public Animal(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public static int compare(Animal animal1,Animal animal2){
        if (animal1.getPrice()>animal2.getPrice()){
            return 1;
        }
        else return -1;
    }

}

