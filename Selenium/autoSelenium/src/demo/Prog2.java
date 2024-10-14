package demo;

import java.util.*;

public class Prog2 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Welcome to the calculator");
			
			System.out.println("please enter the 1st number : ");
			int x = sc.nextInt();
			
			System.out.println("please enter the 2nd number : ");
			int y = sc.nextInt();
			
			int substraction = x-y;
			
			System.out.println("the result of the substraction is :" + substraction);
		}
		

	}

}
