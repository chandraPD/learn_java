package kasir;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import java.util.Scanner;

public class Penjualan {
	private int[] jumlah;
	private Double[] harga;
	private String[] item;
	private int numItems, i;
	static int opsi;
	static int opsiMenu;
	static int no = 0;
	private static final int MAX_ITEM = 30; // maximum number of item
	private static String[][][] listMenu;
	static Scanner sc = new Scanner(System.in);
	static char opsiString;
	static int seq;
	boolean pickJumlah;

	public Penjualan() {
		jumlah = new int[MAX_ITEM];
		harga = new Double[MAX_ITEM];
		item = new String[MAX_ITEM];
		numItems = 0;
	}

	public void addItem(String item, int jumlah, Double harga) {
		this.item[numItems] = item;
		this.jumlah[numItems] = jumlah;
		this.harga[numItems] = harga;
		++numItems;
	}

	public void menu() {
		Menu menu = new Menu();
		mainMenu: while (true) {
			System.out.println("1. Lihat All Menu");
			System.out.println("2. Lihat Menu Paket");
			System.out.println("3. Lihat Menu Makanan");
			System.out.println("4. Lihat Menu Minuman");
			System.out.println("5. Bayar");
			System.out.println("6. exit");
			System.out.print("Pilih Menu : ");
			opsi = Integer.valueOf(sc.nextLine());
			if (opsi == 5 || opsi == 6) {
				if (opsi == 5) {
					print();
				}
				break mainMenu;

			} else {
				listMenu = menu.getAllMenu();
				if (opsi == 1) {
					allMenu: while (true) {
						showAllMenu();
						System.out.println(++no + ") Back");
						int sumPaket = listMenu[0].length + 1;
						int sumMakanan = listMenu[1].length + sumPaket;
						int sumMinuman = listMenu[1].length + sumMakanan;
						System.out.print("Pilih Menu / Back / Bayar : ");
						opsi = Integer.valueOf(sc.nextLine());
//						Pilih Opsi for Paket
						if (opsi >= 1 && opsi < sumPaket) {
							seq = opsi - 1;
							i = 0;
							pickJumlah = true;
//						Pilih opsi for Makanan
						} else if (opsi >= sumPaket && opsi < sumMakanan) {
							seq = opsi - sumPaket;
							i = 1;
							pickJumlah = true;
//						Pilih opsi for Minuman
						} else if (opsi >= sumMakanan && opsi < sumMinuman) {
							seq = opsi - sumMakanan;
							i = 2;
							pickJumlah = true;
						} else if (opsi == no) {
							break allMenu;
						} else {
							pickJumlah = false;
							System.out.println("Angka yang diinputkan Salah, Coba Lagi...");
						}

						if (pickJumlah) {
//						jika paket yang dipilih, kurangin opsi dengan angka 1 untuk mengambil data dan tanyakan jumlah
//						jika makanan yang dipilih, opsi kurangin sumPaket
//						jika minuman yang dipilih, opsi - sumMakanan
							isiJumlah: while (true) {
								System.out.println("Masukkan Jumlah " + listMenu[i][seq][0] + " : ");
								opsi = Integer.valueOf(sc.nextLine());
								if (i == 0) {
									addItem(listMenu[i][seq][1], opsi, Double.valueOf(listMenu[i][seq][2]));
								} else {
									addItem(listMenu[i][seq][0], opsi, Double.valueOf(listMenu[i][seq][1]));
								}
								while (true) {
									System.out.println("Tambah Lagi??? (Y/N)");
									opsiString = sc.nextLine().charAt(0);
									if (opsiString == 'Y' || opsiString == 'y') {
										break isiJumlah;
									} else if (opsiString == 'N' || opsiString == 'n') {
										break allMenu;
									} else {
										System.out.println("Inputan Salah (Y/N)");
									}
								}
							}
						}
					}

				} else if (opsi == 2 || opsi == 3 || opsi == 4) {
					if (opsi == 2) {
						i = 0;
						pickJumlah = true;
					} else if (opsi == 3) {
						i = 1;
						pickJumlah = true;
					} else if (opsi == 4) {
						i = 2;
						pickJumlah = true;
					}
					allMenu: while (true) {
						no = 0;
						ShowMenu(i);
						System.out.println(++no + ") Back");
						System.out.print("Pilih Menu / Back / Bayar : ");
						opsi = Integer.valueOf(sc.nextLine());
						int sum = listMenu[i].length + 1;
						if (opsi >= 1 && opsi < sum) {
							pickJumlah = true;
						} else if (opsi == no) {
							break allMenu;
						} else {
							pickJumlah = false;
							System.out.println("Angka yang diinputkan Salah, Coba Lagi...");
						}

						seq = opsi - 1;
						if (pickJumlah) {

							isiJumlah: while (true) {

								System.out.println("Masukkan Jumlah " + listMenu[i][seq][0] + " : ");
								opsi = Integer.valueOf(sc.nextLine());
								if (i == 0) {
									addItem(listMenu[i][seq][1], opsi, Double.valueOf(listMenu[i][seq][2]));
								} else {
									addItem(listMenu[i][seq][0], opsi, Double.valueOf(listMenu[i][seq][1]));
								}
								while (true) {
									System.out.println("Tambah Lagi??? (Y/N)");
									opsiString = sc.nextLine().charAt(0);
									if (opsiString == 'Y' || opsiString == 'y') {
										break isiJumlah;
									} else if (opsiString == 'N' || opsiString == 'n') {
										break allMenu;
									} else {
										System.out.println("Inputan Salah (Y/N)");
									}
								}
							}
						}
					}

				} else {
					pickJumlah = false;
					System.out.println("Angka yang diinputkan Salah, Coba Lagi...");
				}

			}

		}

	}

	public static void showAllMenu() {

		no = 0;
		for (int i = 0; i < listMenu.length; i++) {
			ShowMenu(i);
		}
	}

	public static void ShowMenu(Integer i) {
		if (i == 0) {
			System.out.println("=== List Paket ===");
		} else if (i == 1) {
			System.out.println("=== List Makanan ===");
		} else {
			System.out.println("=== List Minuman ===");
		}
		for (int j = 0; j < listMenu[i].length; j++) {
			if (i == 0) {
				System.out.printf(++no + ") %s || %s || %s Rupiah", listMenu[i][j]);
				System.out.println();
			} else {
				System.out.printf(++no + ") %s || %s Rupiah", listMenu[i][j]);
				System.out.println();
			}

		}
	}

	public void print() {
		if (numItems == 0) {
			System.out.println("Belum ada Item yang dipilih");
		} else {
			double totalHarga = 0;
			String leftAlignFormat = "| %-30s | %-5s  | %-9s | %-9s |%n";
			String leftAlignFormat2 = "| %-51s | %-9s |%n";
			String leftAlignFormat3 = "| %-9s : %-47s |%n";
			
			LocalDateTime dateTime = LocalDateTime.now(); // yyyy-MM-ddThh:mm:ss.zzz
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss a");
			String generateDate = dateTime.format(formatter);
			System.out.format("+-----------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat3, "Generate Date", generateDate);
			System.out.format("+--------------------------------+--------+-----------+-----------+%n");
			System.out.format("| Item                           | Jumlah | @Harga    | Total     |%n");
			System.out.format("+--------------------------------+--------+-----------+-----------+%n");
			for (int i = 0; i < numItems; i++) {
				double hargaItem = harga[i] * jumlah[i];
				totalHarga = totalHarga + (harga[i] * jumlah[i]);
				System.out.format(leftAlignFormat, item[i], jumlah[i], harga[i], hargaItem);
			}
			double ppn = totalHarga * 10 / 100;
			double bayar = totalHarga + ppn;
			System.out.format("+--------------------------------+--------+-----------+-----------+%n");
			System.out.format(leftAlignFormat2, "Total Bayar", totalHarga);
			System.out.format(leftAlignFormat2, "PPN (10%)", ppn);
			System.out.format(leftAlignFormat2, "Grand Total", bayar);
			System.out.format("+-----------------------------------------------------------------+%n");
		}
	}
}
