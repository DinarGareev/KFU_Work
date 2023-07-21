package oop33;

public class Program {
    public static void main(String[] args) {

        System.out.println("1------------------");
        Account account1 = new Account(12345, 10000);
        int accountId1 = (int)account1.getId();
        System.out.println(accountId1);
        System.out.println("2------------------");
        Account account2 = new Account("12345qwe", 10000);
        System.out.println(account1.getId());
        System.out.println(account2.getId());
        System.out.println("3------------------");
        Account account3 = new Account("1234",10000);
        int accountId = (int)account3.getId(); // приведение типов //account3.getId() - привел к инту.
        System.out.println(accountId);
    }
}
