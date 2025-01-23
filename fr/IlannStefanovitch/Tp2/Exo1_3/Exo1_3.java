package fr.IlannStefanovitch.Tp2.Exo1_3;

public class Exo1_3 {

    public static void main(String[] args) {
       //exo1();
       exo2();
    }
    public static void exo1 () {
        // Test Constructors and toString()
        Circle c1 = new Circle(1.1);
        System.out.println(c1);   // toString()
        Circle c2 = new Circle(); // default constructor
        System.out.println(c2);

        // Test setter and getter
        c1.setRadius(2.2);
        System.out.println(c1);      // toString()
        System.out.println("radius is: " + c1.getRadius());

        // Test getArea() and getCircumference()
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
    public static void exo2 () {
        Author1[] authors = {
                new Author1("Tan Ah Teck", "ahTeck@somewhere.com", 'm'),
                new Author1("Paul Tan", "paulTan@nowhere.com", 'm')
        };

        Book javaDummy = new Book("Java for Dummy", authors, 19.95, 88);
        System.out.println(javaDummy);  // toString()

        // Test getters
        System.out.println("Name: " + javaDummy.getName());
        System.out.println("Price: " + javaDummy.getPrice());
        System.out.println("Quantity: " + javaDummy.getQty());

        // Test setters
        javaDummy.setPrice(29.95);
        javaDummy.setQty(28);
        System.out.println(javaDummy);  // toString()

        // Test authors
        for (Author1 author : javaDummy.getAuthor()) {
            System.out.println(author);
        }
    }

}