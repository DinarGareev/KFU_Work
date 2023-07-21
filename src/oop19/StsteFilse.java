package oop19;

public class StsteFilse implements Stateable{

    @Override
    public void printState(int n) {
        if (n == 1){
            System.out.println("File in opened");
        } else if (n==0) {
            System.out.println("File in closed");
        }else {
            System.out.println("File is undefined");
        }
    }
}
