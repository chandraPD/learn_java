package satwa;

public class App {
	
	public static void main(String[] args) {
		Bird bird = new Bird();
		Cat cat = new Cat(4, "Daging", "Berjalan");
		
		cat.getDescription();
		cat.setLeg(3);
		cat.setEat("Makanan Kucing");
		cat.setWalk("Berlari");
		System.out.println();
		cat.getDescription();

		System.out.println();
		bird.getDescription(2,"Cacing","Terbang");
		System.out.println();
		
		cat.getName();
		bird.getName();
	}
}
