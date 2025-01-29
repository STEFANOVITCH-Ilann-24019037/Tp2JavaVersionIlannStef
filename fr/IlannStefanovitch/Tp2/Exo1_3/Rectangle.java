package fr.IlannStefanovitch.Tp2.Exo1_3;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * Math.PI * length;
    }
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
}
