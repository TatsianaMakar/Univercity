package project;

public class Student extends People {
	private String studentSurname;
	private String studentName;
	private int studentAge;
	//private Adress studentAdr;

	Student(String studentSurname, String studentName, int studentAge, Adress adress) {
		super(adress);
		this.studentSurname = studentSurname;
		this.studentName = studentName;
		this.studentAge = studentAge;
		//this.studentAdr = studentAdr;
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
	
//	public void setStudentAdr(Adress studentAdr) {
//		this.studentAdr = studentAdr;
//	}

//	public Adress getStudentAdr() {
//		return this.studentAdr;
//	}

	public String toString(){
		return "\nInformation about student:\n"+"surname: " + studentSurname + "; name: " + studentName + "; age: " + studentAge+"\nadress: "+super.getAdress().getCity() + ", " + super.getAdress().getStreet() + ", " + super.getAdress().getHomeNumber() + ", " + super.getAdress().getFlatNumber();
	}
}
