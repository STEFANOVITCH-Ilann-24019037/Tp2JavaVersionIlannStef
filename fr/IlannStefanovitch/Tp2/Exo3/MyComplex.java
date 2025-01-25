package fr.IlannStefanovitch.Tp2.Exo3;

public class MyComplex {

    private double real = 0;
    private double imag = 0;

    public MyComplex() {}
    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public double getReal() {
        return real;
    }
    public double getImag() {
        return imag;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public String toString() {
        return "("+real+" + "+imag+"i )";
    }
    public boolean isReal() {
        return imag == 0 ;
    }
    public boolean isImaginary() {
        return real == 0 ;
    }
    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }
    public boolean equals(MyComplex myComplex) {
        return this.real == myComplex.getReal() && this.imag == myComplex.getImag();
    }
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }
    public MyComplex add(MyComplex right ) {
        real += right.real;
        imag += right.imag;
        return this;
    }
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(real + right.real, imag + right.imag);
    }
    //Suite exo
    public MyComplex subtract (MyComplex right) {
        real -= right.real;
        imag -= right.imag;
        return this;
    }
    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(real - right.real, imag - right.imag);
    }
    public MyComplex multiply(MyComplex right) {
        double newReal = this.real * right.real - this.imag * right.imag;
        double newImag = this.real * right.imag + this.imag * right.real;
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double denominator = right.real * right.real + right.imag * right.imag;
        double newReal = (this.real * right.real + this.imag * right.imag) / denominator;
        double newImag = (this.imag * right.real - this.real * right.imag) / denominator;
        this.real = newReal;
        this.imag = newImag;
        return this;
    }
    public MyComplex conjugate() {
        imag *= -1;
        return this;
    }
    public double argument () {
        return Math.atan2(imag, real); //en °
    }



}
