

import java.util.Scanner;

public class StackUsingArray
{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Maximum size of stack: ");
		int maxLength = sc.nextInt();
		Stack s = new Stack(maxLength);
		boolean keepRunning = true;
		while (keepRunning) {
			showMenu();
			System.out.print("Response: ");
			int response = sc.nextInt();
			switch (response) {
				case 1: 
					pushFunction(s, sc);
					break;
				case 2:
					popFunction(s);
					break;
				case 3:
					peekFunction(s);
					break;
				case 4:
					System.out.println("Stack: " + s);
					break;
				case 5:
					keepRunning = false;
					break;
				default:
					System.out.println("Invalid choice.");
					break;
			}
			System.out.println();
		}
		sc.close();
	}

	private static void showMenu() {
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Peek");
		System.out.println("4. View");
		System.out.println("5. Quit");
	}

	private static void pushFunction(Stack s, Scanner sc) {
		System.out.print("Value: ");
		int value = sc.nextInt();
		s.push(value);
	}

	private static void popFunction(Stack s) {
		int value = s.pop();
		System.out.println("Popped value: " + value);
	}

	private static void peekFunction(Stack s) {
		int value = s.peek();
		System.out.println("Top value: " + value);
	}
}

class Stack
{
	private int array[];
	private int length;
	public int top;

	Stack(int maxLength) {
		array = new int[maxLength];
		length = 0;
		top = -1;
	}

	public void push(int value) {
		if (array.length > length) {
			array[length++] = value;
			top = value;
		}
		else System.out.println("Stack is full.");
	}

	public int pop() {
		if (length > 1) {
			int toPop = array[--length];
			int top = array[length-1];
			return toPop;
		}
		else if (length == 1) {
			int toPop = array[--length];
			int top = -1;
			return toPop;
		}
		else System.out.println("Stack is empty.");
		return -1;
	}

	public int peek() {
		if (length > 0) return top;
		else System.out.println("Stack is empty.");
		return -1;
	}

	@Override
	public String toString() {
		if (length > 0) {
			String stackString = "[" + String.valueOf(array[0]);
			for (int i = 1; i < length; ++i) stackString += ", " + array[i];
			stackString += "]";
			return stackString;
		}
		return "[]";
	}
}