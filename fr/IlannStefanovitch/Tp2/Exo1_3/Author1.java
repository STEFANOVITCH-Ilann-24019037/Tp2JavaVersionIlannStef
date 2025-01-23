package fr.IlannStefanovitch.Tp2.Exo1_3;

public class Author1 {
    private String name;
    private String email;
    private char gender;
    public Author1(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;

    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "Name [ " + name + " Author Email: " + email + "] ";

    }

}
