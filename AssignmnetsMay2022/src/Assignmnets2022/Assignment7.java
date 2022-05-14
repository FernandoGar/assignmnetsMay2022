package Assignmnets2022;
import java.util.Scanner;
public class Assignment7 
{
	
	public static void main(String[] args) {
        
        System.out.println("Enter your string : ");
        Scanner in = new Scanner(System.in);
        String enterString = in.nextLine();
        int length = enterString.length();
         
        boolean isPalindrome = true;  
         
        for(int beginIndex = 0; beginIndex < length; beginIndex++)
        {
          if(enterString.charAt(beginIndex) != enterString.charAt(length-1-beginIndex)) {
            System.out.println("String is not a palindrome.");
            isPalindrome = false;
            break;
          }
        }
          
        if(isPalindrome) {
          System.out.println("String is a palindrome.");
        }
    }
	
}
