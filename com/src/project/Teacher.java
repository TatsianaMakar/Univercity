package project;

import java.util.Scanner;

public class Teacher extends People {
	private String teacherSurname;
	private String teacherName;
	private int teacherAge;
	private int salary;
	// private Adress teacherAdr;

	Teacher(String teacherSurname, String teacherName, int teacherAge, Adress adress, String gender, int salary) {
		super(adress, gender);
		this.teacherSurname = teacherSurname;
		this.teacherName = teacherName;
		this.teacherAge = teacherAge;
		this.salary = salary;
		// this.teacherAdr = teacherAdr;
	}

	Teacher(String teacherSurname, String teacherName) {
		this.teacherSurname = teacherSurname;
		this.teacherName = teacherName;
	}

	public void setTeacherSurname(String teacherSurname) {
		this.teacherSurname = teacherSurname;
	}

	public String getTeacherSurname() {
		return this.teacherSurname;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherName() {
		return this.teacherName;
	}

	public void setTeacherAge(int teacherAge) {
		this.teacherAge = teacherAge;
	}

	public int getTeacherAge() {
		return this.teacherAge;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return this.salary;
	}

//	public void setTeacherAdr(Adress teacherAdr) {
//		this.teacherAdr = teacherAdr;
//	}

//	public Adress getTeacherAdr() {
//		return this.teacherAdr;
//	}

	public String toString() {
		return "\nInformation about teacher:" + "\nsurname: " + teacherSurname + "; name: " + teacherName + "; age: "
				+ teacherAge + "\nadress: " + super.getAdress().getCity() + ", " + super.getAdress().getStreet() + ", "
				+ super.getAdress().getHomeNumber() + ", " + super.getAdress().getFlatNumber() + ", "
				+ super.getGender();
	}

	public int salary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vvedite kolichestvo otrabotannyh chasov v mesyac:");
		int hours = sc.nextInt();
		System.out.println("Vvedite chasovyyu tarifnyyu stavky:");
		int stavka = sc.nextInt();
		int salary = hours * stavka;
		System.out.println("Zarabotnaya plata za mesyac: " + salary + " rybley");
		sc.close();
		return salary;
	}

}
