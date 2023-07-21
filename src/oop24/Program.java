package oop24;
// Перечисление
public class Program {
    public static void main(String[] args) {
        Days current = Days.SATURDAY;        //место не выделяем???? .. Создали переменную типа Days, и относительно него
        System.out.println(current);
    }
}
enum Days{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
        }
