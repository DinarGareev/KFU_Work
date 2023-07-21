package tasks;
//подсчет фаториала с помощью рекурсии
//рекурсия - почему произведение полностью не вычесляется, а вычесляется только метод
// зачем нам нужна эта рекурсия если мы можем это сделать с помощью цикла
public class Factorial {

    static int factorial(int n){
        if (n<=1){
            return 1;
        }

        int result = n* factorial(n-1);
        return result;

    }


    public static void main(String[] args) {

        System.out.println(factorial(5));
}
}
