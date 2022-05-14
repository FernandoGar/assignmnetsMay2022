package Assignmnets2022;
//Assignment 6:   Multiplication of two matrices (Use arrays and for loop)

//Assignment 7:  JavaSE application to check whether the given String is Palindrome or not (use String only).

import java.util.Arrays;
public class Assignment6 
{
	public static void main(String[] args) 
	{
		int array1[]= {2,10,5,20};
		int array2[]= {3,5,17,8};
		int result[]= new int[array1.length];
		
		for(int i = 0; i < array1.length; i++) 
		{
			result[i]= array1[i] * array2[i];
			System.out.print(result[i] + " ");
		}
		
//		for(int i =0; i < array1.length; i++) 
//		{
//			System.out.print(result[i] + " ");
//		}
	}
}
