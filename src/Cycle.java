public class Cycle {
    public static void main(String[] args) {
        // for (инициализация счетчика; условие; шаг счетчика)
        // {
        // System.out.println("");
        // }
        // распечатать цифры от одного до пяти включительно с шагом единица
        for (int i = 1; i <= 5; i+=2) // внутри тела указываем три аргумента, сначала идет инициализация
        {
            System.out.println(i);
        }
       //for (int i = 1; i <= 9; ++i)
       //{
       //    System.out.println(i);
       //}
        System.out.println("Это While");
        int j = 1;
        while(j <= 6)       // сразу проверяет истинно ли выражение или нет
        {
            System.out.println(j);
            j++;
        }

        System.out.println();

       do {
           System.out.println(j);
           j++;
       }
       while (j >= 9);    // do   сначала выполняет какую то команду и только потом проверяет условие




    }
}
