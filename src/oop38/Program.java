package oop38;
// Обобщенный конструктор
public class Program {
    public static void main(String[] args) {
        Account account1 = new Account("12345", 1234);
        Account account2 = new Account(56.5656, 1234);
        System.out.println(account1.getId());
        System.out.println(account2.getId());
    }
}
