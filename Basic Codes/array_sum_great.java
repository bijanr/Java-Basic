
import java.util.*;
import static java.lang.System.out;
public class array_sum_great {
    public static void main(String[] args)
    {
        int limit,great,sum=0;
        Scanner sc=new Scanner(System.in);
        out.println("Enter the limit of array : ");
        limit=sc.nextInt();
        int[] arr=new int[limit];
        for(int i=0;i<limit;i++)
        {
            out.print("Enter the "+(i+1)+" element : ");
            arr[i]=sc.nextInt();
        }
        great=arr[0];
        for(int i=0;i<limit;i++)
        {
            if(arr[i]>great)
                great=arr[i];
        }
        for(int i=0;i<limit;i++)
        {
            sum+=arr[i];
        }
        out.println("The greatest number is : "+great);
        out.println("The sum of the elements are : "+sum);
        sc.close();

    }
}
