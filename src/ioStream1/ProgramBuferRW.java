package ioStream1;

import java.io.*;

public class ProgramBuferRW {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text.txt"))) {
            System.out.println("Введем число");
            String text;
            while (!(text = bufferedReader.readLine()).equals("ESC")){ // ДО ТЕХ ПОР ПОКА ЗНАЧЕНИЕ ИЗ КОНСОЛИ НЕ ВСТРЕТИТСЯ В СТРОКЕ, Я БУДУ ПОСТОЯННО ПИСАТЬ В КОНСОЛЬ
                System.out.println("Для выхода набрать ESC");
                bufferedWriter.write(text + "\n");
                bufferedWriter.flush(); //flush() - очищает мой буфер, записали значени и потом зачем нам его хранить в буфере, мы его освобождаем и все
            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
