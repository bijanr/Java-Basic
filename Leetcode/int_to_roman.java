package Leetcode;


/* I             1 IV            4 V             5 IX            9 X             10 XL            40 L             50 XC            90 C             100 CD            400 D             500 DM            900 M             1000 */
import java.util.*;
public class int_to_roman {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] integer = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int number;
        System.out.println("Enter the number ");
        number=sc.nextInt();
        String convert="";
        for(int i=0;i<integer.length;i++)
        {
            while(number >= integer[i])
            {
                convert+=roman[i];
                number-=integer[i];
            }
        }
        System.out.println(convert);
        sc.close();
        
    }
    
}
