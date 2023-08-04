package main.practice;

public class Practice1 {

	public void personName(String name) {
		if(name.equalsIgnoreCase("Guru")) {
			System.out.println("Guru is a good Man");
		}
		else if(name.equalsIgnoreCase("Muru")) {
			System.out.println("Muru is a very bad Man");
		}
		else {
			System.out.println("They are no human");
		}
	}
	
	public static void main(String[] args) {
		Practice1 prct = new Practice1();
		prct.personName("Guru");
		prct.personName("Muru");
		prct.personName("Raja");
	}
}