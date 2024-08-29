import java.util.*;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term of the fibonacci series : ");
        int limit=sc.nextInt();
        int[] array =new int[limit];
        array[0]=0;
        array[1]=1;
        System.out.print("0 1 ");
        for(int i=2;i<limit;i++)
        {
            array[i]=array[i-1]+array[i-2];
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        sc.close();


    }
}
