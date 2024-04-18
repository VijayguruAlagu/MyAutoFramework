package main.practice.java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		long fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find factorial : ");
		int nextInt = sc.nextInt();
		
		for(int i=1; i <= nextInt; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial numb of "+nextInt+" is "+fact);
	}

}
