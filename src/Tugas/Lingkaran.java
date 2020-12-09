package Tugas;

public class Lingkaran implements Fungsi {
	
	private String name = "Lingkaran";
	
	@Override
	public void karakteristik() {		
		// TODO Auto-generated method stub
		this.drawBangunDatar(name);
		System.out.println("Nama Bangun Datar : "+this.name);
		System.out.println("Rumus Luas : 3.14 * r * r");
		System.out.println("Rumus Keliling : 3.14 * D");
		System.out.println("Jumlah sisi : 1" );
	}

	@Override
	public void drawBangunDatar(String bangunDatar) {
		// TODO Auto-generated method stub
		Fungsi.super.drawBangunDatar(bangunDatar);
	}
	
}
