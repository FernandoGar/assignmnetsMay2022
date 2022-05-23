package Assignmnets2022;

import java.util.Scanner;

public class Assignment2 
{
	public static void main(String[] args) 
	{
		double firstNumber;
		double secondNumber;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your First Number please: ");
		firstNumber = scanner.nextDouble();
		System.out.println("Enter your Second Number Please : ");
		secondNumber = scanner.nextDouble();
		
		System.out.println(" PLEASE CHOOSE EITHER +, - , * or / ");
		char operator = scanner.next().charAt(0);
		scanner.close();
		double output;
		switch(operator) 
		{
		case '+' :
			output = firstNumber + secondNumber;
			break;
		
		case '-' :
			output = firstNumber - secondNumber;
			break;
		
		case '*' :
			output = firstNumber * secondNumber;
			break;
		
		case '/' :
			output = firstNumber / secondNumber;
			break;
			
		default:
			System.out.printf("WRONG INPUT");
			return;
		}
		
		System.out.println(firstNumber+" " + operator + " " +secondNumber+ " = "+ output);
		
	}
}
