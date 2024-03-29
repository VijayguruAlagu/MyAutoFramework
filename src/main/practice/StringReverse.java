package main.practice;

public class StringReverse {
	
	public static void main(String[] args) {
		String name = "appa";
		StringBuffer sb = new StringBuffer(name);
		StringBuffer myname = sb.reverse();
		String name1 = myname.toString();
		if(name.equals(name1)) {
			System.out.println(name+" is polinrome");
		}
		else {
			System.out.println(name+" is not polinrome");
		}
	}
}
