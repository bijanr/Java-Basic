package Practical;
import java.util.Scanner;
public class ap_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a, d and n: ");
        double a = sc.nextDouble();
        double d = sc.nextDouble();
        double n = sc.nextDouble();
        sc.close();
        double last_term = a + ((n-1) * d);
        double sum_term = n/2 * (a+last_term);
        for(; a<n; a=a+d)
        {
            System.out.print(a+ " ");
        }
        System.out.println("\n sum: "+ sum_term);
        System.out.println("The last term : "+ last_term);
        
    }
}
