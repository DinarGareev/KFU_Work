package ioStream1;

import java.io.FileInputStream;
import java.io.IOException;

public class ProgramFileIOClose {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("text.txt");
            byte [] buffer = new byte[256];
            int i;
            while ((i = fileInputStream.read(buffer)) != -1){
                for (int j = 0; j<i;j++) {
                    System.out.println((char) buffer[j]);
                }
            }
            System.out.println("Успешно");

        }catch (IOException e){
            System.out.println(e.getMessage());
            System.out.println("Это катч");
        }
        finally {
            try{
                if (fileInputStream != null){
                    fileInputStream.close();
                    System.out.println("Успешное закрытие");
                }
            }
            catch (IOException e){
                System.out.println("Успешное закрытие");
                System.out.println(e.getMessage());

            }
        }
    }
}
