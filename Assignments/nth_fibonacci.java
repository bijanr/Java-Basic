package Assignments;
import java.util.Scanner;
public class nth_fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit of the fibonacci series : ");
        int limit = sc.nextInt();
        int[] fibonacci = new int[limit];
        fibonacci[0] = 0; fibonacci[1] = 1;
        int term1 = fibonacci[0]; int term2 = fibonacci[1]; int termS;
        for(int i = 2; i<limit; i++)
        {
            termS = term1 + term2;
            fibonacci[i] = termS;
            term1 = term2;
            term2 = termS;
        }
        for(int i = 0;i<limit;i++)
        {
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println("");
        System.out.println("Enter the nth term to find out: ");
        int n_term = sc.nextInt();
        System.out.println("The nth term is : " + fibonacci[n_term-1]);
        sc.close();

    }

}