import java.util.Scanner;

public class hypo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the perpendicular : ");
        while(!sc.hasNextDouble())
        {
            System.out.println("Please Enter Double .");
            sc.next();
        }
        double perpendicular=sc.nextInt();
        System.out.println("Enter the base : ");
        while(!sc.hasNextDouble())
        {
            System.out.println("Please Enter Double .");
            sc.next();
        }
        double base= sc.nextInt();
        if(perpendicular<0 || base<0)
        {
            perpendicular=perpendicular-(2*perpendicular);
            base=base-(2*base);
        }
        double hypotenuse=Math.sqrt((Math.pow(perpendicular,2))+(Math.pow(base,2)));
        System.out.println("The hypotenuse is : "+hypotenuse);
        sc.close();


    }
}
