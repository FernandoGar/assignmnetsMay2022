package Assignmnets2022;

import java.util.Scanner;

public class Assignment5 
{
	public static void main (String[] args) 
	{
		System.out.println(" ENTER THE N NUMBER : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(" The next" + " "+ n + " in the Fibonacci series are the following ....");
		int a;
		int x;
		int y;
		int i;
		
		a= x=1;
		
		for(i = 1; i < n; i++) 
		{
			System.out.println(a);
			y = a+x;
			a = x;
			x =y;
		}
	}
}
