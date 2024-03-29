package main.practice;

//factorial is a function that multiplies a number by every number below it

public class Factorial {
//	static int factorialexm(int num) {
//		if(num == 0) {
//			return 1;
//		} else {
//			return(num * factorialexm(num - 1));
//		}
//	}
//	public static void main(String arg[]) {
//		int fact = 1;
//		int num = 8;
//		fact = factorialexm(num);
//		System.out.println("Factorial of "+num+" is "+fact);
//	}

	public static void main(String[] args) {

		int num = 5; //1 * 2 * 3 * 4 * 5

		long factorial = 1;

		for (int i = 1; i <= num; i++) {
			
			factorial = factorial * i;
		}
		
		System.out.println("factorial of number is "+factorial);
	}
}
