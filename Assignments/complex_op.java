package Assignments;

import java.util.*;
public class complex_op{
    public static void main(String[] args) {
        complex a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first complex number : ");
        a = new complex(sc.nextDouble(), sc.nextDouble());
        System.out.println("Enter the second complex number : ");
        b = new complex(sc.nextDouble(), sc.nextDouble());
        System.out.println("A*B : "+ complex.mult(a, b));
        System.out.println("A/B : " + complex.div(a, b));
        sc.close();
    }
}


class complex {
    public double real;
    public double imag;
    complex()
    {
        real = 0.0;
        imag = 0.0;
    }
    complex(double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }
    @Override
    public String toString()
    {
        if(imag < 0.0)
        return String.valueOf(String.format("%.02f",real)) + " - " + String.valueOf(String.format("%.02f",-imag)) + "i";
        else
        return String.valueOf(String.format("%.02f",real)) + " + " + String.valueOf(String.format("%.02f",-imag)) + "i";
    }

    public static complex mult(complex a, complex b)
    {
        complex prod = new complex();
        prod.real = a.real * b.real - a.imag*b.imag;
        prod.imag = b.real * a.imag + a.real * b.imag;
        return prod;
    }
    public static complex div(complex a, complex b)
    {
        complex slash = new complex();
        slash.real = (a.real * b.real + a.imag*b.imag)/(Math.pow(b.real, 2)+ Math.pow(b.imag, 2));
        slash.imag = (b.real * a.imag - a.real * b.imag)/(Math.pow(b.real, 2)+ Math.pow(b.imag, 2));
        return slash;
    }

}
