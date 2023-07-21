package ioStream1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramBufferedReader {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"))){
            //int c;
            //while ((c = bufferedReader.read()) != -1){
            //    System.out.println((char) c);
            String s;
            while ((s = bufferedReader.readLine()) != null){
                System.out.println(s);
            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
