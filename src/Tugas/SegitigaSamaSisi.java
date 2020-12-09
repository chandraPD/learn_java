package Tugas;

public class SegitigaSamaSisi implements Fungsi {

	private String name = "Segitiga Sama Sisi";

	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void karakteristik() {
		// TODO Auto-generated method stub
		this.drawBangunDatar(name);
		System.out.println("Nama Bangun Datar : " + this.name);
		System.out.println("Rumus Luas : alas * tinggi / 2");
		System.out.println("Rumus Keliling : sisi * 3");
		System.out.println("Jumlah sisi : 3" );
	}

	@Override
	public void drawBangunDatar(String bangunDatar) {
		// TODO Auto-generated method stub
		Fungsi.super.drawBangunDatar(bangunDatar);
	}

}
