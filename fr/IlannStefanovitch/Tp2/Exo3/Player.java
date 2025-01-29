package fr.IlannStefanovitch.Tp2.Exo3;

public class Player {

    private int number;
    private float x,y,z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }
    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }
    public void jump (float dz){
        z += dz;
    }
    public boolean near(Ball3_7 ball){
        return this.x - 8 > ball.getX() && this.x + 8 < ball.getX() &&
                this.y - 8 > ball.getY() && this.y + 8 < ball.getY();
    }
    public void kick (Ball3_7 ball) {
        if (this.x == ball.getX() && this.y == ball.getY()) {
            ball.setXYZ(this.x + 15, this.y +15, 0);
        }
        else
            System.out.println("C'est pas bon tu n'a pas la ball");
    }
}
