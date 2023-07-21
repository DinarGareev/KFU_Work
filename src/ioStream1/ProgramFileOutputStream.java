package ioStream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ProgramFileOutputStream {
    public static void main(String[] args) {

        String text = "Hello world";

        try (FileOutputStream fileOutputStream = new FileOutputStream("text.txt")){
            byte [] buffer = text.getBytes();  //создадим массив байтов, и закинем туда строку преобрзованную в массив
            fileOutputStream.write(buffer, 0 , buffer.length); // запишем в массив  байты


            System.out.println("Все прошло успешно");
        }
        catch (IOException e){
            e.getMessage();
        }
    }
}
