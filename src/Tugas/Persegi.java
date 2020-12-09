package Tugas;

public class Persegi implements Fungsi {

	private String name = "Persegi";

	@Override
	public void karakteristik() {
		// TODO Auto-generated method stub
		this.drawBangunDatar(name);
		System.out.println("Nama Bangun Datar : " + this.name);
		System.out.println("Rumus Luas : sisi * sisi");
		System.out.println("Rumus Keliling : sisi * 4");
		System.out.println("Jumlah sisi : 4" );
	}

	@Override
	public void drawBangunDatar(String bangunDatar) {
		// TODO Auto-generated method stub
		Fungsi.super.drawBangunDatar(bangunDatar);
	}

}
