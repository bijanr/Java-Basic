
import java.util.Scanner;
import static java.lang.System.out;
public class hcf_euclidean {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        out.println("Enter the first and second number : ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        int rem;
        int hcf=0,lcm=0,temp;
        //for euclidean algorithm num2 should be > than num1
        if(num1>num2)
        {
            temp=num1;
            num1=num2;
            num2=temp;
        }
        //EUCLEDIAN ALGORITHM
        for(int i=1;i<=num2 && i<=num1;i++)
        {
            /*a=bx+q ;where a and b are two numbers.
                      x is a factor and q is remainder.
                      q becomes a if q!=0*/
            rem=num2%num1;
            if(rem==0)
            {
                hcf=num1;
                break;
            }
            else if(rem==1)
            {hcf=rem;
                break;}
            else{
                num2=num1;
                num1=rem;
            }
        }
        lcm=(num1*num2)/hcf;

        out.println("The hcf is : "+hcf);
        out.println("The lcm is : "+lcm);
        sc.close();;
    }
}
