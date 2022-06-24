package lesson3;

public class Student {
	private String studentSurname;
	private String studentName;
	private int studentAge;
	private Adress studentAdr;

	Student(String studentSurname, String studentName, int studentAge, Adress studentAdr) {
		this.studentSurname = studentSurname;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentAdr = studentAdr;
	}

	public void setStudentSurname(String studentSurname) {
		this.studentSurname = studentSurname;
	}

	public String getStudentSurname() {
		return this.studentSurname;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public int getStudentAge() {
		return this.studentAge;
	}
	
	public void setStudentAdr(Adress studentAdr) {
		this.studentAdr = studentAdr;
	}

	public Adress getStudentAdr() {
		return this.studentAdr;
	}

	public void studentInfo() {
		System.out.println("Information about student:");
		System.out.println("adress:");
		System.out.println(studentAdr.getCity() + " " + studentAdr.getStreet() + " " + studentAdr.getHomeNumber() + " "
				+ studentAdr.getFlatNumber());
		System.out.println("surname: " + studentSurname + " name: " + studentName + " age: " + studentAge);
	}
}
