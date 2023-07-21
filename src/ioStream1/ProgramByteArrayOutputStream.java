package ioStream1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ProgramByteArrayOutputStream {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String text = " Hi World";
        byte [] arr = text.getBytes(); // создали массив из байтов и каждый из элементов преобразовали в отдельный байт


        try {
            byteArrayOutputStream.write(arr);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(byteArrayOutputStream.toString());  // переводим в строковое представление
        byte [] array = byteArrayOutputStream.toByteArray();
        for (int b:array) {
            System.out.println((char)b);
        }



    }
}
