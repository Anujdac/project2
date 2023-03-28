package day6;

import java.util.Scanner;

//wap to ask 8 numbers from user and store them in an array and print them 
public class ArrayExample3 {

	public static void main(String[] args) {

		int k[]= new int[3];
		//System.out.println(k.length);

		Scanner s= new Scanner (System.in);
		
		for(int i=0;i<k.length;i++)
		{
		 System.out.println("enter number");
		
		k[i]= s.nextInt();
		}
		for(int i=0;i<k.length;i++)
		{
		System.out.println(k[i]);
		}
	
		
		
	}

}
