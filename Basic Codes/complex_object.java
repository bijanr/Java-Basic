import java.util.Scanner;

public class complex_object
{
	public static void main(String args[]) {
		Complex a, b;
		Scanner scan = new Scanner(System.in);
		System.out.print("Complex number A\nreal imag: ");
		// works becuz the double after space stays in the buffer
		a = new Complex(scan.nextDouble(), scan.nextDouble());
		System.out.print("Complex number B\nreal imag: ");
		b = new Complex(scan.nextDouble(), scan.nextDouble());
		System.out.println();
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("A+B: " + Complex.add(a, b));
		System.out.println("A*B: " + Complex.multiply(a, b));
		scan.close();
	}
}

class Complex
{
	public double real, imag;

	public Complex() {
		// constructor with no arguments
		real = imag = 0.0;
	}

	public Complex(double real, double imag) {
		// constructor with real and imaginary values
		this.real = real;
		this.imag = imag;
	}

	@Override
	public String toString() {
		// now can be printed using System.out.print
		if (imag < 0.0) {
			return String.valueOf(real) + "-" + String.valueOf(-imag) + "i";
		} else {
			return String.valueOf(real) + "+" + String.valueOf(imag) + "i";
		}
	}

	public static Complex add(Complex a, Complex b) {
		// static function which takes two Complex and returns the sum as a Complex
		Complex csum = new Complex();
		csum.real = a.real + b.real;
		csum.imag = a.imag + b.imag;
		return csum;
	}

	public static Complex multiply(Complex a, Complex b) {
		// static function which takes two Complex and returns the product as a Complex
		Complex cprod = new Complex();
		cprod.real = a.real*b.real - a.imag*b.imag;
		cprod.imag = a.real*b.imag + a.imag*b.real;
		return cprod;
	}
}