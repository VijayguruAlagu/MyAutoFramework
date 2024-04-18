package main.practice.java;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a=10, b=12;
		
//		int t;
//		
//		t = a;
//		a = b;
//		b = t;
		
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swap "+ a +" "+ b);

	}

}
