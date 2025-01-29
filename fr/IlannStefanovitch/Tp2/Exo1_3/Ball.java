package fr.IlannStefanovitch.Tp2.Exo1_3;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = x - this.x;
        this.yDelta = y - this.y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public int getRadius() {
        return radius;
    }
    public float getXDelta() {
        return xDelta;
    }
    public float getYDelta() {
        return yDelta;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }
    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move() {
        x += xDelta;
        y += yDelta;
    }
    public void reflecHorizontal(){
        xDelta = -xDelta;
    }
    public void reflecVertical(){
        yDelta = -yDelta;
    }
    public String toString (){
        return "ball [x=" + x + ", y=" + y + "speed = ( "+xDelta+yDelta + " ) ]";
    }
}
