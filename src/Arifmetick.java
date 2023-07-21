public class Arifmetick {
    public static void main(String[] args) {
        int a= 20;
        int b = 18;
       // int res = a + b;
        //System.out.println(res);
        //System.out.println(a+b);
        //System.out.println(a + 5);
        //System.out.println(5+5);

        int c = a / b; // берет целую часть
        int c1 = a % b; //   делит и берет дробную часть
        System.out.println(c);
        System.out.println(c1);
        System.out.println("a/b = " + (a/b) + "- целая" + "\n" + "a%b = " + (a%b) + " - дробная часть");
        a = a+1;
        a += 2;
        
        //Инкремент постфиксный
      //  a++;

        //Дикремент
      //  a--;
        //System.out.println(a);

        //Инкремент префиксный
        //  ++x1;
        int x1 = 10;
        int y1 = ++x1;  // сначала увеличиваем потом приравнивае
        //System.out.println(x1);
        //System.out.println(y1);
        //System.out.println();


        //постфиксный Инкремент
        //  x2++;
        int x2 = 10;
        int y2 = x2++; //сначала приравняли  а потом увеличили
        //System.out.println(x2);
        //System.out.println(y2);

        //дикремент префиксный
        int x3 = 10;
        int y3 = --x3; // сначала уменьшаем потом приравниваем
        //System.out.println(x3);
        //System.out.println(y3);

//дикремент постфиксный
        int x4 = 10;
        int y4 = x4--; // сначала приравниваем потом делаем
        //System.out.println(x4);
        //ystem.out.println(y4);
    }
}
