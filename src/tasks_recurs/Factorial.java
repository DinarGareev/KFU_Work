package tasks_recurs;

public class Factorial {


    //подсчет факториала числа с помощью цикла
    static int factorial_with_cycle (int x){

        int result = 1;
        for (int i = 1; i <= x; i++){
            result = result*i;
        }
        return result;
    }
    //подсчет факториала числа с помощью рекурсии
    static int factorial_with_recursion (int x) {
             if (x==1){
                return 1;
            }
             return x* factorial_with_recursion(x-1);
    }


    static int fibonachi(int x){
        if (x==0){
            return 0; //возвращаем 0 так как при 0 и 1 возвращает 1 это число фибоначи
        }
        if (x==1){
            return 1; //возвращаем 0 так как при 0 и 1 возвращает 1 это число фибоначи
        }
        else {
            return fibonachi(x-1) + fibonachi(x-2);  // сумма для 5 элементов
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial_with_cycle(0));
        System.out.println(factorial_with_recursion(0));
        System.out.println(fibonachi(0));




    }
}
