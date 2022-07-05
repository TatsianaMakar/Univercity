import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Adress adr1=new Adress("Minsk", "Gintovta",18,8);
        Adress adr2=new Adress("Minsk", "Masherova",4,59);
        Adress adr3=new Adress("Borisov", "Gagarina",67,282);
        Adress adr4=new Adress("Borisov", "Chapaeva",1,15);
        Student student1=new Student("Makar","Elisey",18,adr1);
        Student student2=new Student("Ivanov","Ivan",23,adr3);
        Student student3=new Student("Petrov","Petr",37,adr4);
        Student [] st={student1};
        Teacher teacher1=new Teacher("Dovgel","Tatsiana",35,adr2);
        Group group1 = new Group("Build",114615,st,teacher1);
        System.out.println("Hotite izmenit ychitelya?");
        System.out.println("Vvedite 1 - izmenit. Vvedite 2 - ne izmenyat.");
        int number1 = sc.nextInt();
        if (number1 == 1) {
            group1.newTeacher();
        }
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.deleteStudent(student1);
        System.out.println(group1.toString());
        sc.close();
    }

}
