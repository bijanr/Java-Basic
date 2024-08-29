
import java.util.*;
public class arithmetic_progression_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double nterm=0,sum=0;
        System.out.println("Enter the first term of the Series : ");
        double a=sc.nextDouble();
        System.out.println("Enter the common difference d : ");
        double d=sc.nextDouble();
        System.out.println("Enter the number of elements n : ");
        double n= sc.nextDouble();

        //using formula TS = O(L)
        nterm=a+(d*(n-1));
        sum=(n/2)*(a+nterm);
        System.out.println("The nth term of ap series is "+nterm+"\nThe sum of the nth term of AP series is : "+sum); 
        

        //using loop
        
        /*int i=(int)a; 
        for(; a <= n; a = a+d)
        {
             sum += a;
        }
        System.out.println(sum); */
        sc.close();







    }
}
