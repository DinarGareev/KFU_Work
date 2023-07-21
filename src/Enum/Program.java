package Enum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {


    ProcessType processType = ProcessType.BIT32;
        System.out.println(ProcessType.BIT32.getName("error"));
        System.out.println(Arrays.toString(ProcessType.values()));
        System.out.println(ProcessType.valueOf("BIT64"));
        System.out.println(ProcessType.BIT64.ordinal());
        System.out.println(ProcessType.BIT64.name());



    }
}
