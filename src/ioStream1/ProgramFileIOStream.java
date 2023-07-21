package ioStream1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProgramFileIOStream {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("text.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("test.txt")) {

            byte[] buffer = new byte[256];
            int i;
            while ((i = fileInputStream.read(buffer)) !=-1){
                fileOutputStream.write(buffer,0, i);

            }
            System.out.println("Успешно");

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
