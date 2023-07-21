package oop28;

public class Program {
    public static void main(String[] args) {
        //должны создать переменные нашего перечисления
        Operation operation1 = Operation.SUM;    //создали переменную типа Operation который играет роль типа данных, и сказали ему какую конст будем использовать
        System.out.println(operation1.action(10,12)); //operation1 строится на основе Operation и говорим к каким константам будем привязываться
        System.out.println();

        Operation operation2 = Operation.SUBTRACTION;
        System.out.println(operation2.action(10,12));
        System.out.println();

        Operation operation3 = Operation.MULTIPLY;
        System.out.println(operation3.action(10,12));
    }
}

enum Operation {
    //для каждой конст напишем методы
    SUM{
        public int action(int x, int y){ //название,тип данных, название и аргументы
            return x+y;                  //
        }
    },
    MULTIPLY{
        public int action(int x, int y){
            return x*y;
        }
    },
    SUBTRACTION{
        public int action(int x, int y){
            return x-y;
        }
    };

    public abstract int action(int x, int y); //чтоб появился доступ к методам, мы указываем абстр метод,
                                              // который в своем роде выступает в роли распределителя(говорит что мы должны использовать, от этого родителя есть три потомка)
}                                             // action закидывает нас в метод константы и прорабатывает
                                               //abstract сделали чтобы не было вакханалии внутри метода