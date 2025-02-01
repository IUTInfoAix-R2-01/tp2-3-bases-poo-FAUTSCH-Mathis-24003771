package ex2dot5;

public class TestMain {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "John", 'M');
        System.out.println(c1);
        Account a1 = new Account(1, c1, 1000);
        System.out.println(a1);
        System.out.println(a1.deposit(500));
        System.out.println(a1.withdraw(1000));
        System.out.println(a1.withdraw(500));

        Customer c2 = new Customer(2, "Jane", 'F');
        Account a2 = new Account(2, c2);
        a2.setBalance(545);
        System.out.println(a2);
    }
}
