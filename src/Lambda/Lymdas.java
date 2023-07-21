package Lambda;

public class Lymdas {

  // параметры выражения(сами объекты)  ->  где они выполняюся

    public static void main(String[] args) {
      Operationable operationable; // создали объект интерфейся

      operationable = (x,y) -> x * y;
      int result = operationable.calculate(17,10);
        System.out.println(result);

    }

}
