package Tugas;

public class PersegiPanjang implements Fungsi {
	private String name = "Persegi Panjang";

	@Override
	public void karakteristik() {
		// TODO Auto-generated method stub
		this.drawBangunDatar(name);
		System.out.println("Nama Bangun Datar : " + this.name);
		System.out.println("Rumus Luas : panjang * lebar");
		System.out.println("Rumus Keliling : (panjang * 2) + (lebar * 2)");
		System.out.println("Jumlah sisi : 4" );
	}

	@Override
	public void drawBangunDatar(String bangunDatar) {
		// TODO Auto-generated method stub
		Fungsi.super.drawBangunDatar(bangunDatar);
	}
}
