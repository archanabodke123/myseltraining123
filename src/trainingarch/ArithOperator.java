package trainingarch;

import java.util.Scanner;

public class ArithOperator {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number");
		int i= sc.nextInt();
		System.out.println("Enter second number");
		int j=sc.nextInt();		

		System.out.println("Addition:" + (i+j));
		System.out.println("Difference:" + (i-j));
		System.out.println("Product:" + (i*j));
		System.out.println("Average:" + (i+j)/2);
//		System.out.println("Distance:" + );	--have doubt	

		if(i>j)
		{
			System.out.println("i is maximum");
			System.out.println("j is minimum");
		}else
		{
			System.out.println("i is minimum");
			System.out.println("j is maximum");
		}	
		
	}

}
