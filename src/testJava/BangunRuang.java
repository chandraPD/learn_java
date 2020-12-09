package testJava;

import java.util.Scanner;

public class BangunRuang extends BangunDatar {

	static Scanner sc = new Scanner(System.in);

	static int jenis;
	static char stop;

	static double valAlas, valTinggi, valSisi;

	public static double volumeKubus(double sisi) {
		double VKubus = sisi * sisi * sisi;
		return VKubus;
	}

	public static void main(String[] args) {
		BangunRuang bangunRuang = new BangunRuang();
		while (true) {
			System.out.println("1. Luas Segitiga");
			System.out.println("2. Luas Persegi");
			System.out.println("3. Volume Kubus");
			System.out.print("Pilih Jenis Hitungan : ");

			jenis = Integer.valueOf(sc.nextLine());

			if (jenis == 1 || jenis == 2 || jenis == 3) {
				if (jenis == 1) {
					System.out.print("Input Alas : ");
					valAlas = Integer.valueOf(sc.nextLine());
					System.out.print("Input Tinggi : ");
					valTinggi = Integer.valueOf(sc.nextLine());
					System.out.print("Luas Segitiga : ");
					System.out.println(bangunRuang.luasSegitiga(valAlas, valTinggi));
				} else if (jenis == 2) {
					System.out.print("Input Sisi Persegi : ");
					valSisi = Integer.valueOf(sc.nextLine());
					System.out.print("Luas Persegi : ");
					System.out.println(bangunRuang.luasPersegi(valSisi));
				} else if (jenis == 3) {
					System.out.print("Input Sisi Kubus : ");
					valSisi = Integer.valueOf(sc.nextLine());
					System.out.print("Volume Kubus : ");
					System.out.println(volumeKubus(valSisi));
				}

				System.out.println("Apakah anda ingin Berhenti (Y/N) : ");
				stop = sc.next().charAt(0);
			}else {
				System.out.println("Input yang anda masukkan salah.");
			}

			if (stop == 'Y') {
				System.out.println("Program Selesai");
				break;
			}
		}
	}

}
