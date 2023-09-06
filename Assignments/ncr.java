package Assignments;
import java.util.*;
public class ncr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Combination cb = new Combination();
        //taking input
        System.out.println("Enter the values of n and r: ");
        double n = sc.nextDouble();
        double r = sc.nextDouble();
        System.out.println(cb.calculate(n,r));
        cb.output();
        sc.close();
    }  
}

class Combination extends ncr{ 
    double comb = 0;
    //factorial
    double factorial(double limit)
    {
        double fact = 1;
        if(limit == 1 || limit == 0)
        {
            return 1.00;
        }
        else{
        for(int i = 1; i<=(int)limit; i++)
        {
            fact = fact *i;
        }
        return fact;
    }
    }

    double calculate(double n,double r)
    {
        double x = n-r;
        comb = factorial(n)/(factorial(x)*factorial(r));
        return comb;
    }
    void output()
    {
        System.out.println("The combination is : "+ comb);
    }

}
