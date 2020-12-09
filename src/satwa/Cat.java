package satwa;

public class Cat extends Animal implements Fungsi {

	private String name = "Cat";
	private String eat, walk;
	private int legs;

	public Cat(int legs, String eat, String walk) {
		super(legs, eat, walk);
		// TODO Auto-generated constructor stub
		this.eat = eat;
		this.walk = walk;
		this.legs = legs;
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("Nama Hewan " + this.name);
	}
	

	public void setEat (String eat) {
		this.eat = eat;
	}

	public void setWalk (String walk) {
		this.walk= walk;
	}
	
	public void setLeg (int legs) {
		this.legs = legs;
	}
	
	@Override
	public void getDescription() {
		// TODO Auto-generated method stub
		Animal animal = new Animal(legs, eat, eat);
		System.out.print("Nama Hewan : " + this.name);
		System.out.print(", "+animal.getLeg(legs));
		System.out.print(", "+animal.getEat(eat));
		System.out.print(" dan "+animal.getWalk(walk));
	}

	@Override
	public void getDescription(int legs, String eat, String walk) {
		// TODO Auto-generated method stub
		
	}

}
