package ioStream1;

import java.io.FileInputStream;
import java.io.IOException;

public class ProgramFileInputStream {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("text.txt")) {
            int i;
            while ((i = fileInputStream.read()) != -1){
                System.out.print((char) i);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

   class ProgramFileInputStream1{
    public static void main(String[] args) {
      try (FileInputStream fileInputStream = new FileInputStream("text.txt")){
          byte[] buffer = new byte[256];
          char[] buffer1 = new char[5];
          int i;
          while ((i = fileInputStream.read(buffer)) != -1){
              for (int j = 0; j<i; j++){
                  buffer1[j] = (char)buffer[j];
                  System.out.println((char)buffer[j+1]);
                  System.out.println(buffer1);
              }

          }

      }
      catch (IOException e){
          System.out.println(e.getMessage());
      }
    }
}
