package Tugas;

public interface Fungsi {
	public void karakteristik();
	
	default void drawBangunDatar(String bangunDatar) {
		System.out.println();
		System.out.println("Draw : "+ bangunDatar);
	}
}
