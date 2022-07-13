package project;

import project.util.Convert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// create objects Adress
		Adress adr1 = new Adress("Minsk", "Gintovta", 18, 8);
		Adress adr2 = new Adress("Minsk", "Masherova", 4, 59);
		Adress adr3 = new Adress("Borisov", "Gagarina", 67, 282);
		Adress adr4 = new Adress("Borisov", "Chapaeva", 1, 15);
		// create ArrayList student
		ArrayList<Student> studentArrayList = new ArrayList<Student>();
		Student student1 = new Student("Makar", "Elisey", 18, adr1);
		Student student2 = new Student("Ivanov", "Ivan", 23, adr3);
		Student student3 = new Student("Petrov", "Petr", 37, adr4);
		// create ArrayList teacher
		ArrayList<Teacher> teacherArrayList = new ArrayList<Teacher>() {
			{
				add(new Teacher("Dovgel", "Tatsiana", 35, adr2, "woman", 800));
				add(new Teacher("Kevlich", "Evgenij", 76, adr1, "man", 1600));
				add(new Teacher("Klichko", "Irina", 70, adr3, "woman", 2000));
			}
		};

		// create group
		Group group1 = new Group("Build", 114615, studentArrayList, teacherArrayList.get(0), 2010, 2015);
		// method of change teacher
		System.out.println("Hotite izmenit ychitelya?");
		System.out.println("Vvedite 1 - izmenit. Vvedite 2 - ne izmenyat.");
		int number1 = sc.nextInt();
		if (number1 == 1) {
			group1.newTeacher();
		}
		// add or delete students in the group
		group1.addStudent(student2);
		group1.addStudent(student1);
		group1.addStudent(student3);
		group1.deleteStudent(student2);
		System.out.println(group1.toString());
		sc.close();
		// retired teachers
		System.out.println();
		System.out.println("Retired teachers: ");
		teacherArrayList.stream()
				.filter(teacher -> (teacher.getGender().contains("woman") && teacher.getTeacherAge() >= 58)
						|| (teacher.getGender().contains("man") && teacher.getTeacherAge() >= 63))
				.forEach(teacher -> System.out.println(teacher));
		// salary more than 1500 rubles
		System.out.println();
		System.out.println("Salary more than 1500 rubles gets: ");
		teacherArrayList.stream().filter(teacher -> (teacher.getSalary() > 1500))
				.forEach(teacher -> System.out.println(teacher));

		// create ArrayList group
		ArrayList<Group> groupArrayList = new ArrayList<Group>() {
			{
				add(new Group("Build", 114615, studentArrayList, teacherArrayList.get(0), 2010, 2015));
				add(new Group("Economical", 5798, studentArrayList, teacherArrayList.get(1), 2013, 2018));
				add(new Group("Medicine", 21, studentArrayList, teacherArrayList.get(2), 2000, 2005));
			}
		};
		// Graduate year from 2012 till 2020
		System.out.println();
		System.out.println("Groups with graduate year from 2012 till 2020: ");
		groupArrayList.stream()
				.filter(group -> (group.getGraduationYear() >= 2012 && group.getGraduationYear() <= 2020))
				.forEach(group -> System.out.println(group));
		// convert teacher in methodist
		System.out.println();
		System.out.println("Informathion about our new methodist: ");
		Convert<Methodist, Teacher> convert = teacher -> new Methodist(teacher.getTeacherSurname(),
				teacher.getTeacherName(), teacherArrayList);
		Teacher teacher1 = new Teacher("Dovgeleva", "Inna", 40, adr2, "woman", 800);
		Methodist methodist = convert.converter(teacher1);
		System.out.println(methodist);
		// sort staff
		System.out.println();
		System.out.println("Sorted staff: ");
		ArrayList<Teacher>teacherArrayList1=new ArrayList();
		ArrayList<Teacher> teacherArrayList2 = new ArrayList<Teacher>() {
			{
				add(new Teacher("DDDDDDDD", "Misha", 35, adr2, "man", 800));
				add(new Teacher("KKKKKKKK", "Tatsiana", 35, adr2, "woman", 800));
				add(new Teacher("FFFFFFFFF", "Tatsiana", 35, adr2, "woman", 800));

			}
		};
		teacherArrayList2.stream()
				.sorted(Comparator.comparing(Teacher::getTeacherSurname))
				.forEach(staff->System.out.println(staff));
	}
}
