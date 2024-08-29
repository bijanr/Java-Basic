import java.util.*;
public class sum_natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term of the series of natural number: ");
        int n_term = sc.nextInt();

        int sum = (n_term * (n_term+1))/2;
        int sum_square = (n_term * (n_term+1) * (2*n_term+ 1))/6;
        int sum_cube = ((n_term*n_term) * ((n_term+1) * (n_term+1))) /4;
        System.out.println("The sum of n natural numbers : "+sum);
        System.out.println("The sum of n square : "+sum_square);
        System.out.println("The sum of n cube : "+sum_cube);
        sc.close();

    }
    
}
