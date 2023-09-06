import java.util.*;
public class progression_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the f, d, n : ");
        double f = sc.nextDouble();
        double d = sc.nextDouble();
        double n = sc.nextDouble();

        /*Ap series */
        double last = f + ((n-1) * d);
        double sum1 = (n/2) * (f + last);
        double sum2 = (n/2) * (2*f + ((n-1)*d));
        System.out.println("ARITHMETIC PROGRESSION SERIES : ");
        System.out.println("The last term is : " + last);
        if(sum1 == sum2)
        System.out.println("The sum is : "+ sum1);
        else
        System.out.println("SUM ERROR!!!");

        System.out.println("\n");
        
        System.out.println("GEOMETRIC PROGRESSION SERIES : ");

        /*Gp series */
        double gp_last = f * Math.pow(d, n-1);
        double sum_gp = 0, term;
        for(int i=0; i<n; i++)
        {
            term = f * Math.pow(d,i);
            System.out.print(term + " ");
            sum_gp += term;
        }
        System.out.println(" ");
        double sum_gp1 = f * ((Math.pow(d,n))- 1)/(d-1) ;
        if(sum_gp == sum_gp1)
        System.out.println("The sum is : "+ sum_gp + "\nThe nth term is : "+gp_last);
        else
        System.out.println("ERROR!!!!!");
        sc.close();
    }
}
