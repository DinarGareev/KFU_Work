package exeptions;
//throws - throws - позволяет обработать нашу ошибку при вызове метода
//throws - говорит о том что мы внутри метода должны выкинуть ошибку
//throwable - родитеський источник для всех исключений
//не проверяемые исключения - родитель рантайм эксепшен
public class Factorial_cycle {

    public static void main(String[] args) {

try {
    System.out.println(Cicle_A(-1));
}
catch (Exception exception){
    System.out.println(exception.getMessage());
}

    }

    public static int Cicle_A(int x) throws Exception{
        if (x<1){
            throw new Exception("Выкинул ошибку");
        }
            int resilt = 1;
            for (int i = 0; i<x;i++){
                resilt *= i;
            }return resilt;

    }

    public static int Cicle_B(int x) throws Exception{
        if (x<1){
            throw new Exception("Выкинул ошибку");
        }
        int resilt = 1;
        for (int i = 0; i<x;i++){
            resilt *= i;
        }return resilt;

    }
}


