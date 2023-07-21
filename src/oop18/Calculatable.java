package oop18;

public interface Calculatable {

    default int sum(int a, int b){
        return a+b;
    }

    default int sum1(int a, int b, int c){
        return a+b+c;
    }

    private int sumAll(int ... values){
        int result = 0;
        for (int a:values) {
            result += a;
        }
        return result;
    }

}
