package exeptions;
//Exception - базовый класс для всех исключений(родитель всех типов исключений)
//printStackTrace позволяет нам выводить ошибку которая у нас имеется
// т.е cath ловит ошибку и обрабатывает исключение и с помощью printStackTrace можно еще вызвать ошибку
public class Exceptions {
    public static void main(String[] args) {
        exception_method();
    }
    public static void exception_method(){
        try {
            int [] num = new int[5];
            // num[6] = 45;
            num[6] = Integer.parseInt("qwerty");
            System.out.println(num[6]);
        }
       // catch (Exception exception){
      //      exception.printStackTrace();
    catch (ArrayIndexOutOfBoundsException exception){
        System.out.println("Вы вышли за пределы массива");
    }
        catch (NumberFormatException exception){
            System.out.println("не получилось преобразовать");
        }
        System.out.println("End");

    }

}
