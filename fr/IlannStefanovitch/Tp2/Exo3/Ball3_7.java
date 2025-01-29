package fr.IlannStefanovitch.Tp2.Exo3;

public class Ball3_7 {
    private float x,y,z;

    Ball3_7(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public float getZ() {
        return z;
    }
    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String toString() {
        return "(" + x + "," + y + ", " + z + ")";
    }
}
