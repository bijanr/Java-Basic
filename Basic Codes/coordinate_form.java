import java.util.Scanner;
public class coordinate_form {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        coordinate rectCoordinate, polCoordinate;
        System.out.println("Enter the values of a and b: ");
        rectCoordinate=new coordinate(scan.nextDouble(), scan.nextDouble());
        System.out.println("Polar form : ");
        coordinate.polar(rectCoordinate).displaypol();
        System.out.println("Enter the values of r and 0: ");
        polCoordinate = new coordinate(scan.nextDouble(), scan.nextDouble());
        System.out.println("Rectangular form : ");
        coordinate.rect(polCoordinate).displayrec();
        scan.close();
    }
}

class coordinate{
    double a,b; 
    coordinate()
    {
        a=b=0.0;
    }
    coordinate(double a,double b)
    {
        this.a = a;
        this.b = b;
    }

    public static coordinate polar(coordinate rectCoordinate){
        coordinate polValue = new coordinate();
        polValue.a = (Math.sqrt((Math.pow(rectCoordinate.a,2)) + (Math.pow(rectCoordinate.b, 2))));
        polValue.b = (180/Math.PI) * Math.atan((rectCoordinate.b/rectCoordinate.a));
        return polValue;
    }

    public static coordinate rect(coordinate polCoordinate)
    {
        coordinate rectValue = new coordinate();
        rectValue.a = polCoordinate.a * Math.cos(polCoordinate.b);
        rectValue.b = polCoordinate.a * Math.sin(polCoordinate.b);
        return rectValue;
    }
    /*@Override
    public String toString()
    {
        return '(' + String.format("%.3f",a) + ',' + String.format("%.3f",b) + ')';
    }*/
    public void displaypol()
    {
        System.out.println("( "+ a + ", " + b + " )");
    }
    public void displayrec()
    {
        System.out.println(a+" + "+b+"J");
    }

}
