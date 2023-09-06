package Practical;
import java.util.Scanner;
public class stack {
    static int top = -1;
    static int[] stack = new int[10];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        boolean run = true;
        while(run == true)
        {
            showMenu();
            int choice = sc.nextInt();
            if(choice == 1)
            {
                System.out.println("Enter element: ");
                int value = sc.nextInt();
                
                push(value, top);
            }
            else if(choice == 2)
            {
                pop(top);
            }
            else if(choice == 4)
            {
                for(int i=0;i<10;i++)
                {
                    
                    System.out.print(stack[i]+ " " + top+" ");
                }
            }
            else
            {System.out.println("Invalid ");
            run = false;}
        }
        sc.close();
        
    }

    private static void showMenu()
    {
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Quit");
    }
    private static void push(int value,int top)
    {
        if(top<10)
        {
            stack[++top] = value;
        }
        else
        System.out.println("Overflow");
    }

    private static int pop(int top)
    {
        int popValue = 0;
        if(top<0)
        System.out.println("underflow");
        else
        popValue = stack[--top];
        return popValue;
    }
    
}
