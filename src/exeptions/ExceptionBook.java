package exeptions;
//рекурсия это способ решения задачи в процессе которой появляется подзадача, постановка которой аналоична исходной задаче
// У рекурсии должен быть конец
//

public class ExceptionBook {

    public static void main(String[] args) {
        try {
            int result = ExceptionBook.getFactorial(5);
            System.out.println(result);
        }
        catch (FactorialException exception){
            System.out.println(exception.getMessage());
            System.out.println(exception.getNum());
        }
    }
    public static int getFactorial(int num) throws FactorialException{
        int result = 1;
        if (num<1) throw new FactorialException("Число не может быть меньше 1", num);
        for (int i = 1;i <=num;i++){
            result*=i;
        }
        return result;
    }

}

 class FactorialException extends java.lang.Exception {
    private int num;

     public int getNum() {
         return num;
     }
     public FactorialException(String message, int num){
         super(message);
         this.num = num;

     }
 }
