
import java.util.Scanner;

public class geometric_progression_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first term a : ");
        double a=sc.nextDouble();
        System.out.println("Enter the common ratio r : ");
        double r=sc.nextDouble();
        System.out.println("Enter the number of elements  : ");
        double n= sc.nextDouble();
        double nth_term=a*Math.pow(r,n-1);
        double term,sum=0;
        for(int i=0;i<n;i++)
        {
            term=a*Math.pow(r,i);
            System.out.print(term+ " ");

            sum+=term;
        }
        System.out.println(" ");

        System.out.println("The nth term is : "+nth_term+"\nThe sum of the seriesis : "+sum);
        sc.close();
    }
}
