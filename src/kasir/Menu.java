package kasir;

import java.util.Arrays;

public class Menu {

	private static String[][][] menu = {  { { "Paket A", "Nasi + Ayam Goreng", "5000" },{ "Paket B", "Nasi + Bebek Goreng", "15000" },{ "Paket C", "Nasi Goreng + Telur", "12000" } },
			{  { "Nasi", "3000" },{"Ayam","8000"},{"Telur","5000"}  }, {  { "Teh", "7000" },{"Jeruk","10000"}  } };
	static int no = 0;
	
	
	public String[][][] getAllMenu() {
		return menu;
	}

	
	public String[][]getMenu(Integer i) {
		return menu[i];
	}
	
	public static void setNo() {
		no = 0;
	}

}
