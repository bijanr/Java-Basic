import java.util.*;

public class prime_class {

    int prime_num;
    public static void main(String[] args) {
        prime_class inp1 = new prime_class();
        
        inp1.input_prime();
        inp1.calculate();
    }
    //input method 

    void input_prime() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        prime_num = sc.nextInt();
        System.out.println("test 1 " + prime_num);
        sc.close();
    }

    //calculate method
    
    void calculate()
    {   
        
        for(int i=2; i <= Math.sqrt(prime_num); i++)
        {
           
        }
    }
    

}