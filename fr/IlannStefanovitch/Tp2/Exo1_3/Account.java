package fr.IlannStefanovitch.Tp2.Exo1_3;

public class Account {

    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit(int amount) {
        return balance + amount;
    }
    public int debit(int amount) {
        return balance - amount;
    }
    public int transfer(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
        }
        else{
            System.out.println("Insufficient funds");
        }
        return balance;
    }
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
