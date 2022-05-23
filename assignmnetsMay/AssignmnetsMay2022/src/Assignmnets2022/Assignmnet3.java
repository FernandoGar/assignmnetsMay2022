package Assignmnets2022;

import java.util.Scanner;



//Question3:  Whats difference between literal approach and new keyword approach of String object creation?
	// ANSWER: The key difference is that new() takes more time to execute as a result lower performance while using literal takes less time therefore higher performance

//Question4:  Whats difference between == operator and equals() ?
	// Answer: == is an operator that compares whether two objects are pointing at the same memory location , equal() is a method that compares is two objects have the same value

//Question5:  Is String mutable?
	// ANSWER: NO, Strings cannt be change to represent a new value once they have been created

public class Assignmnet3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num=0;
		char options;
		int evenNumbers = 0;
		int oddNumbers=0;
		
		 do
	        {
	            System.out.print("Enter any number ");
	            num = scanner.nextInt();
	 
	            if( num % 2 == 0)
	            {
	                evenNumbers += num;
	            }
	            else
	            {
	                oddNumbers += num;
	            }
	 
	            System.out.print("Do you want to continue yes/no? (Y/y)(N) ");
	            options = scanner.next().charAt(0);
	 
	        }while(options=='y' || options == 'Y');
	 
	        System.out.println("Sum of even numbers: " + evenNumbers);
	        System.out.println("Sum of odd numbers: " + oddNumbers);
	}

}
