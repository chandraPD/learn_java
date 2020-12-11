package univ;

public class App {
	
	public static void main(String[] args) {
		// Test Student class
		Student s1 = new Student("Chandra PD", "Dr Leimena");
		s1.studentRegistration("Chandra Putra Dinata","123456789");
		s1.learningPlan("Skripsi", 143, "101");
		s1.learningPlan("Skripsi2", 3, "102");
		s1.printCourse();
		System.out.println(s1.getName());

		Student s2 = new Student("Chandra PD", "Dr Leimena");
		s2.studentRegistration("Chandra Putra Dinata","123456789");
		s2.learningPlan("Skripsi", 14, "101");
		s2.learningPlan("Skripsi2", 3, "102");
		s2.printCourse();
		
		// Test Lecture class
		Lecture t1 = new Lecture("Dinata ", "Ayani");
		System.out.println(t1);
		String[] courses = { "Aritmatika", "Skripsi", "Sidang","Skripsi" };
		for (String course : courses) {
			if (t1.addCourse(course)) {
				System.out.println(course + " added.");
			} else {
				System.out.println(course + " cannot be added.");
			}
		}
		t1.printCourse();
		
		
	}

}
