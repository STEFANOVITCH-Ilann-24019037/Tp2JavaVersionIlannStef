package fr.IlannStefanovitch.Tp2.Exo4_5;

public class Customer {
    private int id;
    private String name;
    private int discount;
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public String toString() {
        return "name: " + name + ", discount: " + discount + ", id: " + id;
    }

}
