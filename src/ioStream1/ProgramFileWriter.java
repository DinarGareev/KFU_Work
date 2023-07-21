package ioStream1;

import java.io.FileWriter;
import java.io.IOException;

public class ProgramFileWriter {
    public static void main(String[] args) {
       String text = "Hi sportsmen!!!";
       try (FileWriter fileWriter = new FileWriter("text.txt", true)){
           fileWriter.write(text);
           fileWriter.append('\n');
           fileWriter.append('E');
           fileWriter.write("       ");
           fileWriter.write(123);

       }
       catch (IOException e){
           System.out.println(e.getMessage());
       }
    }
}
