import java.util.*;
public class quadratic_equation {
    public static void main(String[] args) {
        double a,b,c;
        //quad eq= ax^2+bx+c
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a,b,c : ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        double root1,root2;
        if((b*b)-(4*a*c)<0){
            System.out.println("Roots are imaginary ");
            System.exit(0);
        }
        double d=Math.sqrt((Math.pow(b,2))-4*a*c);
        root1=((-b)+d)/(2*a);
        root2=((-b)-d)/(2*a);
        System.out.println("The roots are : "+root1+" "+root2);
        sc.close();
    }

}
