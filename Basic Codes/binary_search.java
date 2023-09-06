import java.util.*;
public class binary_search {    //using bisection algorithm

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Enter the number of elements : ");
        int limit=sc.nextInt();
        int[] array=new int[limit];
        input(array,limit);
        sort(array, limit);
        int ub = array.length-1;
        int lb = 0;
        System.out.println("Enter the elements to be searched : ");
        int search=sc.nextInt();
        bisection_method(array,lb,ub,search);
        sc.close();
    }

    static void input(int[] array,int limit)
    {
        System.out.println("Enter the elements : ");
        for(int i=0;i<limit;i++)
        {
            array[i]=sc.nextInt();
        }
    }
    static void sort(int[] array,int limit)
    {
        int temp;
        for(int i=0;i<limit;i++)
        {
            for(int j=0;j<limit-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    static void bisection_method(int[] array,int lowerbound, int upperbound,int element)
    {   
        int middle=(lowerbound+upperbound)/2;
        while(upperbound>=lowerbound){
            
            if(element>array[middle])
            lowerbound=middle+1;
            else if(element==array[middle])
            {System.out.println("Element present ");
            break;}
            else 
            upperbound=middle-1;
            middle=(lowerbound+upperbound)/2;
            if(upperbound<lowerbound)
            System.out.println("Element not found");
        
    }
}
}
