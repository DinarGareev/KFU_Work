package ioStream1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramBufferedWriter {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text.txt"))){
            String text = "hello hello@@@";
            bufferedWriter.write(text);

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
