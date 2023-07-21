package streamApiPackage;

import java.util.stream.IntStream;

public class ProgramStreamApis {
    public static void main(String[] args) {
        // Stream - поток который работает с данными
        long count = IntStream.of(1,2,3,34,445,5,6,66,55,778).filter(w -> w%2 == 0).count();
        System.out.println(count);
    }
}
