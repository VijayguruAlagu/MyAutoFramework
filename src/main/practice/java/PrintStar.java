package main.practice.java;

public class PrintStar {
	public static void main(String[] args) {
		int row, numOfStar;
		
		for(row = 1; row<=10; row++) {
			for(numOfStar = 1; numOfStar <= row; numOfStar++) {
				System.out.print(" * ");
				if(row == 5) {
					System.out.print(" & ");
				}
			}
			System.out.println();
		}
	}

}
