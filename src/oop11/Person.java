package oop11;
//Статически вложенные классы
//Статически вложенные классы нам нужны, чтобы скрыть некоторую информацию внутри внешнео класса.
//Мы определили вложенный класс для хранения данных про вычисления нашего факториала
public class Person {
    public class Match{
        public static class Factorial{
            private int result;
            private int key;
            public Factorial(int number, int x){     // создадим метод и ему в качестве аргумента закинем...!  . Он внутри себя получает наш result и само число факториал которого мы должны посчитать
                result = number;                     //2.наш объект создается здесь.
                key =x;
            }
            public int getResult(){  // возвращает само значение.т.е возвращает нам значение нашего результата
                return result;
            }

            public int getKey() {   // возвращает само значение.т.е возвращает нам численное значение (х - число до факториала)
                return key;
            }
        }
        public static Factorial getFactorial(int x){  // этот метод выполняет основной подсчет. Он возвращает обект нашего вложенного класса. Получает в качестве числа какой то аргумент
            int result = 1;
            for (int i = 1; i <= x; i++){              //иде подсчет
                result *= i;
            }
            return new Factorial(result,x); //Здесь мы выделили память(внутри метода getFactorial) для нашего объекта факториала
                                            // и наше число х возвращается в качестве объекта нашего факторила
                                            //а наш Factorial это наш конструктор
        }
    }
        public static void main(String[] args) {
            Match.Factorial factorial = Match.getFactorial(5); //3. далее мы вызываем наш объект. Говорим что хотим создать переменную, котороая
            //т.е мы создаем объект factorial, тут гворим. что хотим вызвать метод getFactorial. Метод находится внутри класса Match
            System.out.println(factorial.getResult());
            System.out.println(factorial.getKey());
        }

}
