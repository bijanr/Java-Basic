
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class dynamic_data_structure {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        ArrayList<Integer> ds=new ArrayList<>();
        System.out.println("Enter the elements sequentially : \nPress -999 to quit.");
        for(; true; )
        {
            int temp=Integer.parseInt(br.readLine());
            if(temp==-999)
                break;
            else
            {
                ds.add(temp);
            }
        }
        int sum=0,great=ds.get(0);
        for(int i=0;i<ds.size();i++)
        {
            System.out.println("Element "+(i+1)+ ": "+ds.get(i));
            sum+=ds.get(i);
            great=ds.get(i);
            if(ds.get(i)>great)
            {
                great=ds.get(i);
            }
        }
        

        System.out.println("Size of array is: "+ds.size()+" \nThe sum of array is : "+sum+"\nThe greatest element is : "+great);


    }
}
