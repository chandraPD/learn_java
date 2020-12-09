package testJava;

public class Biodata {
	
	public String fname = "Chandra";
	public String lname = "Dinata";
	public String domisili = "Pekanbaru";
	public String tahun = "1996";
	String fullName;
	
	public void fullNameMethod() {
		fullName = fname + " " + lname;
		System.out.println("Full Name : " + fullName);
		System.out.println("Domisili : "+ domisili);
	}
	
	public void fullNameMethod2(String fname, String lname) {		
		System.out.println("Full Name : " + fname + " " + lname);
	}
	
	public String fullNameMethod3 (String fname, String lname) {		
		return "Full Name : " + fname + " " + lname;
	}
	
	public static void main(String[] args) {
		Biodata biodata = new Biodata();
		biodata.fullNameMethod();
		System.out.println("Tahun : " + biodata.tahun);
		biodata.fullNameMethod2("Chandra","Dinata1");
		System.out.println(biodata.fullNameMethod3("Chandra","Dinata2"));
	}
}
