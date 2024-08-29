
import java.util.*;
import static java.lang.System.out;

public class ncr {

    double fact( double num)
    {
        if(num==1 || num==0)
            return 1.0;
        else
            return num * fact(num-1);
    }
    public static void main(String args[])
    {
        double n,r;
        Scanner sc=new Scanner(System.in);
        out.println("Enter the value of n : ");
        n=sc.nextDouble();
        out.println("Enter the value of r : ");
        r=sc.nextDouble();
        double x=n-r;

        ncr objNcr=new ncr(); 
        double sum=(objNcr.fact(n))/((objNcr.fact(x))*(objNcr.fact(r)));
        out.println("The sum is : "+sum);
        sc.close();


    }

}
