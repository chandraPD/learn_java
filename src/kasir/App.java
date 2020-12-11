package kasir;

import java.util.Scanner;

public class App {

	static int jenis;

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		new Penjualan().menu();
	}
}
