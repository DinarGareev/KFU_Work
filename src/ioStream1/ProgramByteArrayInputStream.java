package ioStream1;

import java.io.ByteArrayInputStream;

public class ProgramByteArrayInputStream {
    public static void main(String[] args) {
        byte[] arr1 = new byte[]{12,32,34,54,56};
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(arr1);
        int i ;
        while ((i = byteArrayInputStream1.read()) != -1){
            System.out.println(i);
        }

        String text  = " Hello world";
        byte[] arr2 = text.getBytes();
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(arr2);
        int j;
        while ((j=byteArrayInputStream2.read()) != -1){
            System.out.println((char)j);
        }
    }
}
