package fr.IlannStefanovitch.Tp2.Exo3;
import java.util.Scanner;


public class Exo3
{
        public static void  main (String [] args) {
        MyComplexApp();
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
        public static void MyComplexApp (){
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
}
