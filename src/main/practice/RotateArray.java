package main.practice;

import java.util.Arrays;

public class RotateArray {
	
	public static void main(String[] args) {
		int[] input = { 23,52,45,24,63,35};
		
		System.out.println(Arrays.toString(input));
		
		int midPoint = input.length/2;
		
		for(int i=0; i < midPoint; i++) {
			int temp = input[i];
			input[i] = input[midPoint+i];
			input[midPoint+i] = temp;
		}
		System.out.println(Arrays.toString(input));
	}

}
