package fr.IlannStefanovitch.Tp2.Exo3;

import java.math.BigInteger;
import java.util.Scanner;


public class Exo3
{
        public static void  main (String [] args) {
            TestTime();
        }
        public static void test () {
            MyComplex myComplex = new MyComplex(1.0,2.0);
            MyComplex myComplex3 = new MyComplex();
            System.out.println(myComplex.toString());
            System.out.println(myComplex3.toString());
            myComplex3.add(myComplex);
            System.out.println(myComplex3.getImag() +" "+myComplex3.getReal());
            myComplex3.setReal(20.0);
            System.out.println(myComplex3.getImag() +" "+myComplex3.getReal());
            myComplex.setValue(14,10);
            System.out.println(myComplex.getImag() +" "+myComplex.getReal());
            System.out.println(myComplex.magnitude());
        }
        public static void MyComplexApp () {
            MyComplex complex1 = new MyComplex();
            MyComplex complex2 = new MyComplex();
            Scanner input = new Scanner(System.in);
            System.out.println("Enter complex number 1 (complex 1): ");
            complex1.setReal(input.nextDouble());
            complex1.setImag(input.nextDouble());
            System.out.println("Enter complex number 2 (complex 2): ");
            complex2.setValue(input.nextDouble(),input.nextDouble());
            System.out.println("Number 1 is : " +complex1.toString());
            if (complex1.isReal()){
                System.out.println(complex1.toString() +" is a 100% real ");
            }else {
                System.out.println(complex1.toString() +" is not 100% real");
            }
            if(complex1.isImaginary()){
                System.out.println(complex1.toString() +" is a 100% imaginary");
            }
            else {
                System.out.println(complex1.toString() +" is not a 100% imaginary");
            }
            System.out.println(" ");

            //complex 2
            System.out.println("Number 2 is : " +complex2.toString());
            if (complex2.isReal()){
                System.out.println(complex2.toString() +" is a 100% real ");
            }else {
                System.out.println(complex2.toString() +" is not 100% real");
            }
            if(complex2.isImaginary()){
                System.out.println(complex2.toString() +" is a 100% imaginary");
            }
            else {
                System.out.println(complex2.toString() +" is not a 100% imaginary");
            }
            System.out.println(" ");
            if(complex1.equals(complex2)){
                System.out.println(complex1.toString() +" is equal to "+complex2.toString());
            }
            else {
                System.out.println(complex1.toString() +" is not equal to "+complex2.toString());
            }

            System.out.println(complex1.toString() +" + " + complex2.toString() + " = " + complex1.add(complex2).toString());


        }
        public static void MyPolynomial () {
            Scanner input = new Scanner(System.in);
            MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
            System.out.println("Enter polynomial 1 (polynomial 1): ");
            MyPolynomial p2 = new MyPolynomial(input.nextDouble(),input.nextDouble(),input.nextDouble());

            System.out.println("p1: " + p1);
            System.out.println("p2: " + p2);

            System.out.println("Degree of p1: " + p1.getDegree());
            System.out.println("Degree of p2: " + p2.getDegree());

            System.out.println("p1 evaluated at 2: " + p1.evaluate(2));
            System.out.println("p2 evaluated at 3: " + p2.evaluate(3));

            MyPolynomial p3 = p1.add(p2);
            System.out.println("p1 + p2: " + p3);

            MyPolynomial p4 = p1.multiply(p2);
            System.out.println("p1 * p2: " + p4);

        }

    public static void TestBigInteger() {
        BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");
        System.out.println(i1.add(i2));
        System.out.println(i1.multiply(i2));

    }
    public static void TestTime() {
            MyTime myTime = new MyTime();
            System.out.println(myTime.toString());
            myTime.setTime(24,5,40);
            System.out.println(myTime.toString());
            myTime.nexSecond();
            System.out.println(myTime.toString());
            myTime.previousSecond();
            System.out.println(myTime.toString());
    }
}
