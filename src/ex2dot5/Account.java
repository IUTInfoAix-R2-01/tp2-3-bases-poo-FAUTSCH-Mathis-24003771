package ex2dot5;

public class Account {
    private final int id;
    private final Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "name(" + getCustomerName() + ") balance=$" + getBalance();
    }

    public String getCustomerName() {
        return getCustomer().getName();
    }

    public Account deposit(double amount) {
        setBalance(balance + amount);
        return this;
    }

    public Account withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("amount withdrawn exceeds the current balance!");
        } else {
            setBalance(getBalance() - amount);
        }
        return this;
    }
}
