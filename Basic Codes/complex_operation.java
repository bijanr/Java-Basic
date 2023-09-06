

//z1 z2=(a1+ib1)(a2+ib2) = (a1 a2 – b1 b2 ) + i(a1 b2 + a2 b1 )
import java.util.Scanner;

public class complex_operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real and imaginary part of number A : ");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();
        System.out.println("Enter the real and imaginary part of number B : ");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();
        while(true)
        {
        System.out.println("Enter \n1.Add\n2.Subtract\n3.Multiply\n4.Divide");
        int c = sc.nextInt();
        if(c!=-999) {
            switch (c) {
                case 3 -> {
                    double real_mult = ((r1 * r2) - i1 * i2);
                    double imag_mult = ((r1 * i2) + (r2 * i1));
                    System.out.println("The Multiplication is: " + real_mult + " + i" + imag_mult);
                }
                case 1 -> {
                    double real_add = r1 + r2;
                    double imag_add = i1 + i2;
                    System.out.println("The Addition is: " + real_add + " + i" + imag_add);
                }
                case 2 -> {
                    double real_sub = r1 - r2;
                    double imag_sub = i1 - i2;
                    if(imag_sub<0)
                    System.out.println("The Subtraction is: " + real_sub + " - i" + Math.abs(imag_sub));
                    else
                        System.out.println("The Subtraction is: " + real_sub + " + i" + imag_sub);

                }
                case 4 -> {
                    double real_div = ((r1 * r2) + (i1 * i2)) / ((Math.pow(r2, 2)) + Math.pow(i2, 2));
                    double imag_div = ((r2 * i1) - (r1 * i2)) / (Math.pow(r2, 2) + Math.pow(i2, 2));
                    if(imag_div<0)
                        System.out.println("The Division is: " + real_div + " - i" +Math.abs(imag_div));
                    else
                        System.out.println("The Division is: " + real_div + " + i" + imag_div);
                }
                default -> System.out.println("Please provide a valid integer!");
            }
        }
        else
            System.exit(0);
            sc.close();

    }

    
}
}
