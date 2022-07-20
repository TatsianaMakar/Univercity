package model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static org.junit.Assert.*;

public class GroupTest {
    private Student student1;
    private Student student2;
    private Student student3;
   // private Group group;

   @Before
   public void setUp() throws Exception {
       student1 = new Student("Makar", "Elisey", 18, "man");
       student2 = new Student("Ivanov", "Ivan", 23, "man");
       student3 = new Student("Petrov", "Petr", 35, "man");
   };



    @Test
    public void addStudent() {
        Teacher teacher=new Teacher("Dovgel", "Tatsiana", 35, "woman", 800);
        ArrayList<Student> expectedStudent = new ArrayList<Student>();
        expectedStudent.add(student1);
        expectedStudent.add(student2);
        expectedStudent.add(student3);
        Group expectedGroup=new Group("Build", 114615, expectedStudent, teacher, 2010, 2015);
        ArrayList<Student> actualStudent = new ArrayList<Student>();
        Group actualGroup=new Group("Build", 114615, actualStudent, teacher,2010, 2015);
        actualGroup.addStudent(student1);
        actualGroup.addStudent(student2);
        actualGroup.addStudent(student3);
        Assert.assertEquals(expectedGroup.getStudentArrayList(),actualGroup.getStudentArrayList());
    }

    @Test
    public void deleteStudent() {
        Teacher teacher=new Teacher("Dovgel", "Tatsiana", 35, "woman", 800);
        ArrayList<Student> expectedStudent = new ArrayList<Student>();
        expectedStudent.add(student1);
        expectedStudent.add(student2);
        expectedStudent.add(student3);
        expectedStudent.remove(student2);
        Group expectedGroup=new Group("Build", 114615, expectedStudent, teacher, 2010, 2015);
        ArrayList<Student> actualStudent = new ArrayList<Student>();
        Group actualGroup=new Group("Build", 114615, actualStudent, teacher,2010, 2015);
        actualGroup.addStudent(student1);
        actualGroup.addStudent(student2);
        actualGroup.addStudent(student3);
        actualGroup.deleteStudent(student3);
        Assert.assertEquals(expectedGroup.getStudentArrayList(),actualGroup.getStudentArrayList());
    }
}