package streamApiPackage;

import java.util.stream.Stream;

public class Program7 {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(2,34,54,45,434,545,4,233,4);
        //берет значение до тех пор пока верны условия
        //integerStream.takeWhile(n -> n > -10).forEach(n -> System.out.println(n));

        //берет значение до тех пор пока не верны условия - откидывает все первые значения
        integerStream.dropWhile(n -> n < 5).forEach(s-> System.out.println(s));
    }
}
