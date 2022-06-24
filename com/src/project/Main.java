package lesson3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Adress adr1=new Adress("Minsk", "Gintovta",18,8);
		Adress adr2=new Adress("Minsk", "Masherova",4,59);
		Student student1=new Student("Makar","Elisey",18,adr1);
		Teacher teacher1=new Teacher("Dovgel","Tatsiana",35,adr2);
		Group group1 = new Group("Build",114615,student1,teacher1);

		System.out.println("Hotite izmenit ychenika?");
		System.out.println("Vvedite 1 - izmenit. Vvedite 2 - ne izmenyat.");
		int number = sc.nextInt();
		if (number == 1) {
			group1.newStudent();
		}
		System.out.println("Hotite izmenit ychitelya?");
		System.out.println("Vvedite 1 - izmenit. Vvedite 2 - ne izmenyat.");
		int number1 = sc.nextInt();
		if (number1 == 1) {
			group1.newTeacher();
		}

		group1.groupInfo();
		sc.close();
	}

}
