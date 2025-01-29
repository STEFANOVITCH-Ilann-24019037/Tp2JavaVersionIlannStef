package fr.IlannStefanovitch.Tp2.Exo1_3;

public class InvoiceItem {
    private int id;
    private int qty;
    private double uniPrice;
    private String desc;

    public InvoiceItem(int id, int qty, double uniPrice, String desc) {
        this.id = id;
        this.qty = qty;
        this.uniPrice = uniPrice;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }
    public int getQty() {
        return qty;
    }
    public double getUniPrice() {
        return uniPrice;
    }
    public String getDesc() {
        return desc;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public void setUniPrice(double uniPrice) {
        this.uniPrice = uniPrice;
    }
    public double getTotal() {
        return uniPrice * qty;
    }
    public String toString() {
        return "InvoiceItem [id=" + id + ", qty=" + qty + ", uniPrice=" + uniPrice+ ", desc=" + desc + "]";
    }
}
