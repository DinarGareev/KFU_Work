package task_Home_Work;

import java.lang.reflect.Parameter;

//1.Написать функцию, которая принимает 2 целочисленных параметра, и возвращает наибольший из них
//2.Написать функцию, которая принимает один целочисленный параметр и возвращает значение равному этому параметру возведенному в куб
public class Return {
    public static void main(String[] args) {
        int value1 = 1000;
        int value2 = 1200;
        int result = getMax(value1, value2);
        System.out.println(result);
    }
        public static int getMax (int value1, int value2) {
            if (value1 > value2) {
                return value1;
            } else return value2;
        }

}
