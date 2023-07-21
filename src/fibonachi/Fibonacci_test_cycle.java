package fibonachi;

public class Fibonacci_test_cycle {
    public static void main(String[] args) {
        int num0 = 0;
        int num1 = 1;
        int num2;

        System.out.println(num0+" "+num1+" ");
        for (int i = 3; i<=10; i++) {
            num2 = num1+num0;
            System.out.println(num2+" ");
            num0=num1;
            num1=num2;

        }
        //System.out.println(num2);
    }
}
