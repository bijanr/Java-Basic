package Assignments;

import java.util.Scanner;

public class integer_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int limit=sc.nextInt();
        System.out.println("Enter the elements : ");

        int[] n=new int[limit];
        for(int i=0;i<limit;i++)
        {
            n[i]=sc.nextInt();

        }
        int temp;
        for(int i=0;i<limit;i++)
        {
            for(int j=0;j<limit-i-1;j++)
            {
                if(n[j]>n[j+1])
                {
                    temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
        System.out.println("The sorted elements are: ");
        for(int i=0;i<limit;i++)
        {
            System.out.print(n[i]+" ");

        }
        System.out.println("\n");
        sc.close();

    }
}