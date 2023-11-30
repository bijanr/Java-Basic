package Assignments;

import java.util.*;
public class gp_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first term a : ");
        int a = sc.nextInt();
        System.out.println("Enter the common ratio r : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of elements  : ");
        int n = sc.nextInt();
        //double n_term = a * Math.pow((double)r,(double)n-1);
        double sum = 0,term;
        for(int i=0; i<n; i++)
        {
            term = a * Math.pow(r,i);
            System.out.print(term + " ");
            sum += term; 
        }
        System.out.println("");
        System.out.println("The sum is: " + sum);
        sc.close();
    }
    
}
