package ioStream1;

import java.io.*;

public class ProgramBufferedOutputStream {
    public static void main(String[] args) {
        String text = "Hello sister!!!";
        try (FileOutputStream fileOutputStream = new FileOutputStream("text.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)){

            byte[] buffer = text.getBytes();
            bufferedOutputStream.write(buffer,0, buffer.length);

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
