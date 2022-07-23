

import base.Adress;
import base.People;
import model.Group;
import model.Methodist;
import model.Teacher;
import util.Convert;
import util.SurnameComporator;

import java.io.IOException;
import java.util.*;

import static util.Parser.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // create group
        Group group1 = new Group("Build", 114615, parserStudents(), parserTeachers().get(0), 2010, 2015);
        // method of change teacher
        System.out.println("Hotite izmenit ychitelya?");
        System.out.println("Vvedite 1 - izmenit. Vvedite 2 - ne izmenyat.");
        int number1 = sc.nextInt();
        if (number1 == 1) {
            group1.newTeacher();
        }
        // add or delete students in the group
        group1.addStudent(parserStudents().get(1));
        group1.addStudent(parserStudents().get(0));
        group1.addStudent(parserStudents().get(2));
        group1.deleteStudent(parserStudents().get(0));
        System.out.println(group1.toString());
        sc.close();
        // retired teachers
        System.out.println();
        System.out.println("Retired teachers: ");
        parserTeachers().stream()
                .filter(teacher -> (teacher.getGender().contains("woman") && teacher.getAge() >= 58)
                        || (teacher.getGender().contains("man") && teacher.getAge() >= 63))
                .forEach(teacher -> System.out.println(teacher));
        // salary more than 1500 rubles
        System.out.println();
        System.out.println("Salary more than 1500 rubles gets: ");
        parserTeachers().stream().filter(teacher -> (teacher.getSalary() > 1500))
                .forEach(teacher -> System.out.println(teacher));

        // create ArrayList group
        ArrayList<Group> groupArrayList = new ArrayList<Group>() {
            {
                add(new Group("Build", 114615, parserStudents(), parserTeachers().get(0), 2010, 2015));
                add(new Group("Economical", 5798, parserStudents(), parserTeachers().get(1), 2013, 2018));
                add(new Group("Medicine", 21, parserStudents(), parserTeachers().get(2), 2000, 2005));
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
        System.out.println("Information about our new methodist: ");
        Convert<Methodist, Teacher> convert = teacher -> new Methodist(teacher.getSurname(),
                teacher.getName(), teacher.getAge(), teacher.getAdress(), teacher.getGender(), parserTeachers());
        Teacher teacher1 = parserTeachers().get(1);
        Methodist methodist = convert.converter(teacher1);
        System.out.println(methodist);
        // sort staff
        System.out.println();
        System.out.println("Sorted staff: ");
        ArrayList<People> staff = new ArrayList<People>() {
            {
                add(parserTeachers().get(0));
                add(parserTeachers().get(2));
                add(parserMethodist().get(0));
                add(parserMethodist().get(1));
            }
        };

        staff.stream()
                .sorted()
                .forEach(x -> System.out.println(x));
        //comparator sort
        Comparator surComparator = new SurnameComporator();
        Collections.sort(staff, surComparator);
        System.out.println(staff);
    }
}
