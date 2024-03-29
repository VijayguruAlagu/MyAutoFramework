package main.practice;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");

		int num = sc.nextInt();

		int org_num = num;
		int rev = 0;
		
		while (num != 0) {
			rev = rev * 10 + num % 10; //1)num=123>> 0 + 3 2) 30 + 2 3) 320 + 1
			num = num / 10;			   //1)12 2)1 3)0
		}

		if (org_num == rev) {
			System.out.println(org_num + " Palindrome number");
		} else {
			System.out.println(org_num + " not Palindrome number");
		}
	}
}
