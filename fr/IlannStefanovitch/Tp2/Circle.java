package fr.IlannStefanovitch.Tp2;

public class Circle {
    double radius;
    public Circle() {
        radius = 1.2;//set le radius a 1;é si pas de param
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
