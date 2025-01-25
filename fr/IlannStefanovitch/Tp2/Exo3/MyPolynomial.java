package fr.IlannStefanovitch.Tp2.Exo3;
public class MyPolynomial {
    private double[] coeffs;


    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (sb.length() > 0) {
                    sb.append(" + ");
                }
                sb.append(coeffs[i]);
                if (i > 0) {
                    sb.append("x");
                    if (i > 1) {
                        sb.append("^").append(i);
                    }
                }
            }
        }
        return sb.toString();
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial another) {
        int maxLength = Math.max(this.coeffs.length, another.coeffs.length);
        double[] resultCoeffs = new double[maxLength];
        for (int i = 0; i < maxLength; i++) {
            if (i < this.coeffs.length) {
                resultCoeffs[i] += this.coeffs[i];
            }
            if (i < another.coeffs.length) {
                resultCoeffs[i] += another.coeffs[i];
            }
        }
        return new MyPolynomial(resultCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial another) {
        double[] resultCoeffs = new double[this.coeffs.length + another.coeffs.length - 1];
        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < another.coeffs.length; j++) {
                resultCoeffs[i + j] += this.coeffs[i] * another.coeffs[j];
            }
        }
        return new MyPolynomial(resultCoeffs);
    }
}
