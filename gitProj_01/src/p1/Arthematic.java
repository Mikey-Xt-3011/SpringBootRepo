package p1;

import java.util.Scanner;

public class Arthematic 
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value a:");
		int a = s.nextInt();
		System.out.println("Enter value b:");
		int b = s.nextInt();
	      int c = a+b;
		System.out.println("Sum of "+c);
	}

}
