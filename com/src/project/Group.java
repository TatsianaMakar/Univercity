package lesson3;

import java.util.Scanner;

public class Group {
	Scanner sc = new Scanner(System.in);
	private String groupName;
	private int courseNumber;
	private Student student1;
	private Teacher teacher1;

	Group(String groupName, int courseNumber, Student student1, Teacher teacher1) {
		this.groupName = groupName;
		this.courseNumber = courseNumber;
		this.student1 = student1;
		this.teacher1 = teacher1;
	}
	
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupName() {
		return this.groupName;
	}
	
	public void setStudent1(Student student1) {
		this.student1 = student1;
	}

	public Student getStudent1() {
		return this.student1;
	}
	
	public void setTeacher1(Teacher teacher1) {
		this.teacher1 = teacher1;
	}

	public Teacher getteacher1() {
		return this.teacher1;
	}
	
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	public int getCourseNumber() {
		return this.courseNumber;
	}

	public void newStudent() {
		System.out.println("Information about new student: ");
		System.out.println("Vvedite familiyu novogo studenta:");
		student1.setStudentSurname(sc.nextLine());
		System.out.println("Vvedite imya novogo studenta:");
		student1.setStudentName(sc.nextLine());
		System.out.println("Vvedite vozrast novogo studenta:");
		student1.setStudentAge(sc.nextInt());
		System.out.println("Vvedite gorod novogo studenta:");
		student1.getStudentAdr().setCity(sc.nextLine());
		student1.getStudentAdr().setCity(sc.nextLine());
		System.out.println("Vvedite ylicy novogo studenta:");
		student1.getStudentAdr().setStreet(sc.nextLine());
		System.out.println("Vvedite nomer doma novogo studenta:");
		student1.getStudentAdr().setHomeNumber(sc.nextInt());
		System.out.println("Vvedite nomer kvartiry novogo studenta:");
		student1.getStudentAdr().setFlatNumber(sc.nextInt());
	}

	public void newTeacher() {
		System.out.println("Information about new teacher: ");
		System.out.println("Vvedite familiyu novogo ychitelya:");
		teacher1.setTeacherSurname(sc.nextLine());
		teacher1.setTeacherSurname(sc.nextLine());
		System.out.println("Vvedite imya novogo ychitelya:");
		teacher1.setTeacherName(sc.nextLine());
		System.out.println("Vvedite vozrast novogo ychitelya:");
		teacher1.setTeacherAge(sc.nextInt());
		System.out.println("Vvedite gorod novogo ychitelya:");
		teacher1.getTeacherAdr().setCity(sc.nextLine());
		teacher1.getTeacherAdr().setCity(sc.nextLine());
		System.out.println("Vvedite ylicy novogo ychitelya:");
		teacher1.getTeacherAdr().setStreet(sc.nextLine());
		System.out.println("Vvedite nomer doma novogo ychitelya:");
		teacher1.getTeacherAdr().setHomeNumber(sc.nextInt());
		System.out.println("Vvedite nomer kvartiry novogo ychitelya:");
		teacher1.getTeacherAdr().setFlatNumber(sc.nextInt());
		System.out.println("Vvedite dannie dlya rascheta zarplaty:");
		teacher1.salary();
		sc.close();
	}

	public void groupInfo() {
		System.out.println("Information about group:");
		System.out.println("Nazvanie gruppi: " + groupName + " nomer gruppi: " + courseNumber);
		student1.studentInfo();
		teacher1.teacherInfo();

	}

}
