import java.util.Scanner;

public class recc_fib
{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n: ");
		int n = sc.nextInt();
		sc.close();
		int num = n - 1;
		System.out.println("nth Fibonacci: " + getNthFibonacci(num));
	}

	private static long getNthFibonacci(int n) {
		double rootFive = Math.sqrt(5);
		double nterm = Math.pow(1+rootFive, n);
		nterm -= Math.pow(1-rootFive, n);
		nterm /= Math.pow(2, n) * rootFive;
		return (long)nterm;
	}
}