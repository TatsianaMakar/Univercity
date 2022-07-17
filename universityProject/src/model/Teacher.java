package model;

import base.Adress;
import base.People;

import java.util.Scanner;

public class Teacher extends People {
		private int salary;
	// private Adress teacherAdr;


	public Teacher(int salary) {
		this.salary = salary;
	}

	public Teacher(String surname, String name, int age, Adress adress, String gender, int salary) {
		super(surname, name, age, adress, gender);
		this.salary = salary;
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


	@Override
	public String toString() {
		return "\nTeachers surname: "+getSurname()+" name: "+getName()+" age: "+getAge()+" salary: "+getSalary();
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
