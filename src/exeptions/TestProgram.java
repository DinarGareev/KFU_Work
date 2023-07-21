package exeptions;

import java.util.Scanner;

//throw - ключевое слово говорит о том, что мы создаем свое новое исключение
//throws - позволяет обработать нашу ошибку при вызове метода
public class TestProgram {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            if (x < 0 || x > 100){
                throw new Exception ("Создали свое собственное исключение");
            }
            System.out.println(x);
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }
}
