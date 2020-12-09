package satwa;

public class Animal {
	private int legs;
	private String eat;
	private String walk;
	
	public Animal(int legs, String eat, String walk) {
		super();
		this.legs = legs;
		this.eat = eat;
		this.walk = walk;
	}
	
	public String getEat (String eat) {
		return "Memakan " + eat;
	}
	
	public String getWalk (String walk) {
		return "Bergerak dengan " + walk;
	}
	public String getLeg (int leg) {
		return "Berkaki " + leg;
	}
	
	
}
