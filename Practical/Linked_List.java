package Practical;
import java.util.Scanner;
import java.util.LinkedList;
public class Linked_List {
    static LinkedList<Integer> list = new LinkedList<>();
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        Scanner sc=new Scanner(System.in);
        boolean run = true;
        int value;
        while(run == true)
        {
            ll.showMenu();
            System.out.println("Enter the value: ");
            int choice  = sc.nextInt();
            switch(choice)
            {
            case 1-> {
                System.out.println("Enter number to be Added: ");
                value = sc.nextInt();
                ll.Add(value);
                }

            case 2-> {
                System.out.println("Enter the index and element to be inserted: ");
                int i = sc.nextInt();
                value = sc.nextInt();
                ll.insert(value, i);
            }
            case 5 ->{
                System.out.println(list);
            }
            }
        }
        sc.close();

    }

    public void showMenu()
    {
        System.out.println("1. Add \n2. Insert \n3. Delete \n4. Replace \n5. Print \n6. Peek \n7. Quit");
    }

    public void Add(int value)
    {
        list.add(value);
    }

    public void insert(int value, int i)
    {
        list.add(i, value);
    }

    public void delete(int i)
    {
        list.remove(i);
    }

    public void replace(int value, int i)
    {
        list.set(i,value);
    }



}
