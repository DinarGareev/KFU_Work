package tasks;

public class Methods {
    public static void main(String[] args) {

        ////hello();
        ////bye();
        //int num1 = 13;
        //int num2 = 15;
        //summa(num1,num2);
        //minus(10,4,2);
        //info("Sergey","Gordev", "Alexeevich",123);
       // summa1("Dinar",1,2,3,4,5);
        //int res1 = summa2(12,32);
        //System.out.println(res1);
        //res1++;
        //System.out.println(res1);
        //summa3();


        System.out.println(summa5(12,28));
        System.out.println(summa5(12.5,28.4));
        System.out.println(summa5(12,28,1));
    }
    static void hello()
    {
        System.out.println("Hello");
    }
    static void bye()
    {
        System.out.println("Bye");
    }

    static void summa(int num1, int num2)
    {
        int res1 = num1+num2;
        System.out.println(res1);
    }

    static void minus (int num1,int num2,int num3)
    {
        int res1 = num1 - num2 - num3;
        System.out.println(res1);
    }

    static void info(String name, String surname, String patronimic, int age)
    {
        System.out.println( name+surname+patronimic+age);
    }

    static void summa1(String name, int ...nums)
    {
        int res1 = 0;
        for (int n:nums){
            res1 = res1 + n;
        }
        System.out.println(name + " " + res1);

    }

    static int summa2(int num1, int num2)
    {
        int res1 = num1 + num2;
        return res1;
    }

    static void summa3() {
        int res1 = summa2(12, 38);         //обязательно обращаемся к методу
        System.out.println(res1);
    }

    static int summa5(int num1, int num2)
    {
        return num1 + num2;
    }
    static double summa5(double num1, double num2){
        return num1 + num2;
    }
    static int summa5(int num1, int num2,int num3)
    {
        return num1 + num2 + num3;
    }

}
