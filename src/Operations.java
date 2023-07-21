public class Operations {
    public static void main(String[] args) {
        int a1 = 12;
        int b1 = 10;

        // проверка на равенство
        //boolean c11 = a1 == b1+2;
        //boolean c12 = a1 == 12;
        //System.out.println(c11);
        //System.out.println(c12);
        //System.out.println(a1==b1);

        int a2 = 12;
        int b2 = 10;
        // проверка на неравенство
        boolean c21 = a2 != b2+2;
        boolean c22 = a2 != 12;
        //System.out.println(c21);
        //System.out.println(c22);
        //System.out.println(a2 != b2);

        boolean c31 = a2 > b2;
        boolean c32 = a2 < b2;
        //System.out.println(c31);
        //System.out.println(c32);
        //System.out.println();

        int a4 = 15;
        int b4 = 15;
        boolean c41 = a4 >= b4;
        //System.out.println(c41);

        //Логические операции
        //  | - (или) либо одно либо второе
        int a5 = 12;
        int b5 = 17;
        int c5 = a5 | b5;

        // & - (and) говорит о том что должно выполнятся и то и то (знак коньюнкии)
        c5 = a5 & b5;


        int num1 = 8;
        int num2 = 12;
        if (num1 > num2)
        {
            System.out.println(num1 + " > " + num2);
            System.out.println("Привет");
        } else if (num1 < num2)
        {
            System.out.println(num1 + " < " + num2);
            System.out.println("Здорова");
        }
        else
        {
            System.out.println("Они равны");
        }

        int num3 = 16;
        switch (num3) {
            case 1:
                System.out.println("Это число " + num3);
                break;
            case 2:
                System.out.println("Это число " + num3);
                break;
            case 16:
                System.out.println("Это число " + num3);
                num3++;
            case 17:
                System.out.println("Это число " + num3);
                num3++;
            default:
                System.out.println("Мы не нашли нужное число " + num3);


        }

    }
}
