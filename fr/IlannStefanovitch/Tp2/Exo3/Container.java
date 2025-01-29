package fr.IlannStefanovitch.Tp2.Exo3;

public class Container {
    private int x1, y1, x2, y2;

    public Container(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public int getX1() {
        return x1;
    }
    public int getY1() {
        return y1;
    }
    public int getX2() {
        return x2;
    }
    public int getY2() {
        return y2;
    }
    public int getWidth() {
        return x2 - x1;
    }
    public int getHeight() {
        return y2 - y1;
    }
    public boolean collides(fr.IlannStefanovitch.Tp2.Exo3.Ball ball ){
        if (ball.getX() - ball.getRadius() <= this.x1 ||
                ball.getX() - ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            return true;
        }
        else if ( ball.getY() - ball.getRadius() <= this.y1 ||
                ball.getY() - ball.getRadius() >= this.y2){
            ball.reflectVertical();
            return true;
        }
        return false;
    }
}
