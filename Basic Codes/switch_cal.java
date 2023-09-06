
import java.util.*;
import java.io.*;

class switch_cal
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string 1 : ");
        String St1=br.readLine();
        System.out.println("Enter the string 2 : ");
        String St2=sc.nextLine();
        System.out.println(St1+St2);
        sc.close();

    }
}