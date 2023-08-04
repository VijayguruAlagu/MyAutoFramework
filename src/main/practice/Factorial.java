package main.practice;

public class Factorial {
	static int factorialexm(int num) {
		if(num == 0) {
			return 1;
		} else {
			return(num * factorialexm(num - 1));
		}
	}
	public static void main(String arg[]) {
		int fact = 1;
		int num = 8;
		fact = factorialexm(num);
		System.out.println("Factorial of "+num+" is "+fact);
	}
}
 