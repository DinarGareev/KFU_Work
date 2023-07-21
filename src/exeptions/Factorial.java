package exeptions;

public class Factorial {
    static int factorial_with_cycle1 (int x) throws Exception{

        if (x<1){
            throw new Exception("число не может быть отрицательным"); // самостоятельно выбрасываю ошибку
        }

        int result = 1;
        for (int i = 1; i <= x; i++){
            result = result*i;
        }
        return result;
    }

    static int factorial_with_cycle2 (int x) {


        int result = 1;

        //внутри метода обработаем ошибку. раз внутри метода то нам не нужен throws Exception
        try {
            if (x<1){
                throw new Exception("число не может быть отрицательным(wbrk2)"); // самостоятельно выбрасываю ошибку
            }

            for (int i = 1; i <= x; i++) {
                result = result * i;
            }
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
            result = x;
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

        // System.out.println(factorial_with_recursion(0));
       // System.out.println(fibonachi(0));

        try {
            System.out.println(factorial_with_cycle1(4));
        }
        catch (Exception exception){
            System.out.println(exception.getMessage()); //getMessage - перетаскивает то что я написал в методе, вывод на консоль
        }
        System.out.println(factorial_with_cycle2(0));

        System.out.println("End");


    }
}
