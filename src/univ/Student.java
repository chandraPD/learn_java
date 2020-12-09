package univ;

public class Student extends Person implements Fungsi {
	// Instance variables
	private int numCourses; // number of courses taken so far, max 30
	private String[] courses; // course codes
	private String gelar = "";
	private String fullName;
	private String cardIdentitas;
	private int[] sks;
	private String[] room;
	
//	private int[] grades; // grade for the corresponding course codes
	private static final int MAX_COURSES = 30; // maximum number of courses

	public Student(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
		numCourses = 0;
		courses = new String[MAX_COURSES];
//		grades = new int[MAX_COURSES];
		sks = new int[MAX_COURSES];
		room = new String[MAX_COURSES];
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i : sks)
		sum += i;
		if(sum > 144) {
			gelar = "ST";
		}
		if(this.fullName != "") {
			return "Student: " + this.fullName + " "+ gelar + ", NIM : " + this.cardIdentitas;
		}else {
			return "Student: " + super.toString();	
		}
		
	}

//	// Add a course and its grade - No validation in this method
//	public void addCourseGrade(String course, int grade) {
//		courses[numCourses] = course;
//		grades[numCourses] = grade;
//		++numCourses;
//	}
//
//	// Print all courses taken and their grade
//	public void printGrades() {
//		System.out.println("Print Grades");
//		System.out.print(this);
//		for (int i = 0; i < numCourses; ++i) {
//			System.out.print(" " + courses[i] + ":" + grades[i]);
//		}
//		System.out.println();
//
//		System.out.println("End Print Grades");
//	}
//
//	// Compute the average grade
//	public double getAverageGrade() {
//		int sum = 0;
//		for (int i = 0; i < numCourses; i++) {
//			sum += grades[i];
//		}
//		return (double) sum / numCourses;
//	}

	@Override
	public void studentRegistration(String fullName, String cardIdentitas) {
		// TODO Auto-generated method stub
		this.fullName = fullName;
		this.cardIdentitas = cardIdentitas; 
	}

	@Override
	public void learningPlan(String courseName, int sks, String room) {
		// TODO Auto-generated method stub
		courses[numCourses] = courseName;
		this.sks[numCourses] = sks;
		this.room[numCourses] = room;
		++numCourses;
	}

	public void printCourse() {
		System.out.println("Begin Print Course");
		System.out.println(this);
		int no = 0;
		for (int i = 0; i < numCourses; ++i) {
			System.out.println(" Course "+ ++no +"  : " + courses[i] + " | " + sks[i] + " SKS | Ruang " + room[i]);
		}
		System.out.println("End Print Course");
	}
	
	
}
