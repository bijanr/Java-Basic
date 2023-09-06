import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entet the number : ");
        double number = sc.nextDouble();
        double limit = Math.sqrt(number);
        int count= 0;

        for(int i = 2;i <= limit;)
        {
            if(number % i == 0)
            count = 1;
            break;
        }

        if(count == 0)
        System.out.println((int)number + " is prime. ");
        else
        System.out.println((int)number + " is composite. ");

        sc.close();

    }
}
