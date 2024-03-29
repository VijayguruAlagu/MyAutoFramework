package main.practice;

public class SwapTwonum {

	public static void main(String[] args){

		int a = 10, b = 20;

		System.out.println("Before swapping the number... "+a+" "+b);

		//Logic 1 using temp variable

		int t = a;
		a = b;
		b = t;

		System.out.println("After swapping the number... "+a+" "+b);

		//Logic 2 using algorithm

		b = a+b-(a=b);
		
		System.out.println("After swapping the number... "+a+" "+b);
	}
}
