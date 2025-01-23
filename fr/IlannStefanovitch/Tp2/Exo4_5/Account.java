package fr.IlannStefanovitch.Tp2.Exo4_5;

public class Account {
    private int id;
    private CustomerExo5 customer;
    private double balance;

    public Account(int id, CustomerExo5 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account(int id, CustomerExo5 customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }
    public CustomerExo5 getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString() {
        return "id: " + id + ", customer: " + customer + ", balance: " + balance +" $ ";
    }
    public String getCuntomerName() {
        return customer.getName();
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
}
