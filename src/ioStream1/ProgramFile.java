package ioStream1;

import java.io.File;
import java.io.IOException;

public class ProgramFile {
    public static void main(String[] args) {
   File directory2 = new File("C://Users//Dinar.Gareev//Desktop//d1");
        //File file2 = new File("C://d1","text.txt");
        boolean direct = directory2.mkdir();
        if (direct) {
            System.out.println("OK!OK! - Папка создана");
        }
        File directory1 = new File("C://Users//Dinar.Gareev//Desktop//d1/ARSENAL.txt");
        try
        {
            boolean create = directory1.createNewFile();
            if (create) {
                System.out.println("OK!OK! - Папка создана");
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        File directory3 = new File("C://Users//Dinar.Gareev//Desktop//d1/ARSENAL.txt");
        System.out.println(directory3.getAbsoluteFile());
        directory1.length();
    }
}
