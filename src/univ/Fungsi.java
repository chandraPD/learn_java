package univ;

public interface Fungsi {
	default void studentRegistration(String fullName, String cardIdentitas) {
	}
	public void learningPlan(String courseName, int sks, String room);
}
