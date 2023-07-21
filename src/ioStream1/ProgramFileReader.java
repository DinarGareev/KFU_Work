package ioStream1;

import java.io.FileReader;
import java.io.IOException;

public class ProgramFileReader {
    public static void main(String[] args) {
       try (FileReader fileReader = new FileReader("text.txt")){
           int c;
           while ((c = fileReader.read()) != -1){
               System.out.println((char) c);
           }

       }
       catch (IOException e){
           System.out.println(e.getMessage());
       }
    }
}
