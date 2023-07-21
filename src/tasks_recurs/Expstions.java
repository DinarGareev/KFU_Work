package tasks_recurs;
//одна ошибка возникающая
public class Expstions {

    static void exeptions_method(){
        try {
            int[] numbers = new int[5];
            //numbers[6] = 146;
            numbers[6] = Integer.parseInt("qwe");
            System.out.println(numbers[6]);
        }
      // catch (Exception exception){
        catch (ArrayIndexOutOfBoundsException exception){
           // exception.printStackTrace();
            System.out.println("Вы вышли за пределы массива");
        } // после завершения этого блока программа продалжает работать

        catch (NumberFormatException exception){
            System.out.println("Ошибка преобразования строки в число");
        }

        finally {
            System.out.println("Finally End");
        }
        System.out.println("End");




    }

    public static void main(String[] args) {
        exeptions_method();
    }
}
