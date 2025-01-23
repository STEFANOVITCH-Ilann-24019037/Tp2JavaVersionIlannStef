package fr.IlannStefanovitch.Tp2.Exo4_5;

public class Author {
    private String name;
    private String email;
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;

    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "Name [ " + name + " Author Email: " + email + "] ";

    }

}
