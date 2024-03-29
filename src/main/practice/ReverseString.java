package main.practice;

public class ReverseString {
	
	public static void main(String[] args) {
		String s = "Test Automation qwer1";
		
		/*
		StringBuffer sb = new StringBuffer(s);
		StringBuffer rev = sb.reverse();
		*/
		/*
		StringBuilder sbl = new StringBuilder();
		sbl.append(s);
		
		StringBuilder rev = sbl.reverse();
		*/
		
//		String[] split = s.split(" ");
		
//		char[] words = s.toCharArray();
		String rev = "";
		
		for(int i = s.length()-1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.print(rev);
		
	}
}
