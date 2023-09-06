package Assignments;
import java.util.*;
public class quadratic_roots {
    public static void main(String[] args) {
        //unicode for power '\u00B2'
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients a, b, c : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("The equation is : " + a+"x"+'\u00B2'+" + "+b+"x"+ " + "+c);
        double discriminant = (b*b)-(4*a*c);
        double root1, root2;
        if(discriminant > 0)    //for real roots
        {
            root1 = (-b + Math.sqrt(discriminant))/(2*a);
            root2 = (-b - Math.sqrt(discriminant))/(2*a);
            System.out.println("Roots : " + root1 + " " + root2);
        }
        if(discriminant == 0)   //for equal roots
        {
            root1 = -b/(2*a);
            root2 = root1;
            System.out.println("Roots : " + root1 + " " + root2);
        }
        if(discriminant < 0)    //for imaginary roots
        {
            root1 = -b/(2*a);
            double imag = Math.sqrt(-discriminant)/(2.0*a);
            System.out.println(String.format("%.2f",imag));
            System.out.println("Root 1: "+String.format("%.2f",root1)+" +i"+String.format("%.2f",imag));
            System.out.println("Root 2: "+String.format("%.2f",root1)+" -i"+String.format("%.2f",imag));
        }
        sc.close();
        
    }
    
}
