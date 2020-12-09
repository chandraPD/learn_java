package Tugas;

public class App {
	public static void main(String[] args) {
		Lingkaran lingkaran = new Lingkaran();
		Persegi persegi = new Persegi();
		SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi();
		PersegiPanjang persegiPanjang = new PersegiPanjang();
		System.out.println("Contoh Bangun Datar :");
		lingkaran.karakteristik();
		persegi.karakteristik();
		segitigaSamaSisi.karakteristik();
		persegiPanjang.karakteristik();
	}
}
