package testJava;

public class Persegi {
	
	public void createPersegi(int x) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Persegi persegi = new Persegi();
		persegi.createPersegi(10);
	}
}
