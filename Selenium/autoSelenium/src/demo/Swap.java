package demo;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("hey! You can swap your number here");
		
		System.out.println("Please enter the value of A = ");
		int a=sc.nextInt();
		System.out.println("Please enter the value  of B = ");
		int b=sc.nextInt();
		
		int c=a;
		a=b;
		b=c;
		System.out.println("whoa!! swapping done");
		System.out.println("The value of A' is : "+ a);
		System.out.println("The value of B' is : "+ b);
		
		
		
	}

}
