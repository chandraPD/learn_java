package satwa;

public class Bird implements Fungsi {

	private String name = "Bird";

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("Nama Hewan : " + name);
	}

	@Override
	public void getDescription(int legs, String eat, String walk) {
		// TODO Auto-generated method stub
		System.out.println("Nama Hewan : " + this.name + ", Berkaki " + legs + ", Memakan " + eat
				+ " dan Bergerak dengan cara " + walk);
	}

	@Override
	public void getDescription() {
		// TODO Auto-generated method stub

	}

}
