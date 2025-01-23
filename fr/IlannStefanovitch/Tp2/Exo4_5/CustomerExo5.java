package fr.IlannStefanovitch.Tp2.Exo4_5;

public class CustomerExo5 {
    private String name;
    private int id;
    private char gender;

    public CustomerExo5(String name, int id, char gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return "name: " + name + " ( " + id + " ) ";
    }
}
