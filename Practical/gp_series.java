package Practical;

import java.util.*;

public class gp_series {

    static int a, r, n;


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a, r, n: ");
        a = sc.nextInt();
        r = sc.nextInt();
        n = sc.nextInt();
        gp_series gpObj = new gp_series();
        
        sc.close();
        int sum1=0;
        for(int i = 0; i < n; i++)
        {
            System.out.print(gpObj.gpTerm(a, r, i) + " ");
            sum1 += gpObj.gpTerm(a, r, i);
            
        }
        System.out.println("\nThe nth term of gp series is : "+ gpObj.lastTerm(a, r, n));
        System.out.println("The Sum of Gp series is: " + sum1);

    }

    private int lastTerm(int value, int r, int n)
    {
        int last;
        last = value  * (int)Math.pow(r, n-1);
        return last;
    }

    private int gpTerm(int value, int r, int i)
    {
        int term;
        term = value * (int)Math.pow(r,i);
        return term;
    }

    
}
