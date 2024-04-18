package main.practice.java;

import java.util.Scanner;

public class FindLargestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Three numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+" is Larger  number");
			if(a % 2 ==0) {
				System.out.print(a+" is even number too");
				
			}
		}
		else if(b>a && b>c) {
			System.out.println(b+" is Larger  number");
			if(b % 2 ==0) {
				System.out.print(b+" is even number too");
				
			}
		}
		else if(c>b && c>a) {
			System.out.println(c+" is Larger  number");
			if(c % 2 ==0) {
				System.out.print(c+" is even number too");
				
			}
		}
		else {
			System.out.println("All numbers are equal");
		}

	}

}
