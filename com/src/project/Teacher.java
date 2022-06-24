package lesson3;

import java.util.Scanner;

public class Teacher {
	private String teacherSurname;
	private String teacherName;
	private int teacherAge;
	private Adress teacherAdr;

	Teacher(String teacherSurname, String teacherName, int teacherAge, Adress teacherAdr) {
		this.teacherSurname = teacherSurname;
		this.teacherName = teacherName;
		this.teacherAge = teacherAge;
		this.teacherAdr = teacherAdr;
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
	
	public void setTeacherAdr(Adress teacherAdr) {
		this.teacherAdr = teacherAdr;
	}

	public Adress getTeacherAdr() {
		return this.teacherAdr;
	}

	public void teacherInfo() {
		System.out.println("Information about teacher:");
		System.out.println("adress:");
		System.out.println(teacherAdr.getCity() + " " + teacherAdr.getStreet() + " " + teacherAdr.getHomeNumber() + " "
				+ teacherAdr.getFlatNumber());
		System.out.println("surname: " + teacherSurname + " name: " + teacherName + " age: " + teacherAge);
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
