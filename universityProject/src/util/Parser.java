package util;

import base.Adress;
import model.Methodist;
import model.Student;
import model.Teacher;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Parser {


    public static ArrayList<Student> parserStudents() throws IOException {
        FileInputStream fileIn = null;
        String str = "";
        try {
            fileIn = new FileInputStream("students.txt");
            int a;
            while ((a = fileIn.read()) != -1) {
                str += (char) a;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
        }
        return parseStudent(str);
    }

    public static ArrayList<Teacher> parserTeachers() throws IOException {
        FileReader fileIn = null;
        String str = "";
        try {
            fileIn = new FileReader("teachers.txt");
            int a;
            while ((a = fileIn.read()) != -1) {
                str += (char) a;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
        }
        return parseTeacher(str);
    }

    public static ArrayList<Methodist> parserMethodist() throws IOException {
        FileInputStream fileIn = null;
        String str = "";
        try {
            fileIn = new FileInputStream("methodist.txt");
            int a;
            while ((a = fileIn.read()) != -1) {
                str += (char) a;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
        }
        return parseMethodist(str);
    }

    private static ArrayList<Student> parseStudent(String str) {
        ArrayList<Student> students = new ArrayList<>();
        str = str.trim();
        String[] massStudents = str.split("\n");
        for (String el : massStudents) {
            String[] massStEl = el.split(" ");
            Adress adress = new Adress(massStEl[3], massStEl[4], Integer.parseInt(massStEl[5]), Integer.parseInt(massStEl[6]));
            students.add(new Student(massStEl[0], massStEl[1], Integer.parseInt(massStEl[2]), adress, massStEl[7]));
        }
        return students;
    }

    private static ArrayList<Teacher> parseTeacher(String str) {
        ArrayList<Teacher> teachers = new ArrayList<>();
        str = str.trim();
        String[] massTeachers = str.split("\n");
        for (String el : massTeachers) {
            String[] massTeachEl = el.split(" ");
            Adress adress = new Adress(massTeachEl[3], massTeachEl[4], Integer.parseInt(massTeachEl[5]), Integer.parseInt(massTeachEl[6]));
            teachers.add(new Teacher(massTeachEl[0], massTeachEl[1], Integer.parseInt(massTeachEl[2]), adress, Integer.parseInt(massTeachEl[7]), massTeachEl[8]));
        }
        return teachers;
    }

    private static ArrayList<Methodist> parseMethodist(String str) {
        ArrayList<Methodist> methodists = new ArrayList<>();
        str = str.trim();
        String[] massMethodist = str.split("\n");
        for (String el : massMethodist) {
            String[] massMethEl = el.split(" ");
            Adress adress = new Adress(massMethEl[3], massMethEl[4], Integer.parseInt(massMethEl[5]), Integer.parseInt(massMethEl[6]));
            ArrayList<Teacher> teachers = new ArrayList<>();
            for (int i = 8; i < massMethEl.length; i += 9) {
                Adress teachAdr = new Adress(massMethEl[i + 3], massMethEl[i + 4], Integer.parseInt(massMethEl[i + 5]), Integer.parseInt(massMethEl[i + 6]));
                teachers.add(new Teacher(massMethEl[i + 0], massMethEl[i + 1], Integer.parseInt(massMethEl[i + 2]), teachAdr, Integer.parseInt(massMethEl[i + 7]), massMethEl[i + 8]));
            }
            methodists.add(new Methodist(massMethEl[0], massMethEl[1], Integer.parseInt(massMethEl[2]), adress, massMethEl[7], teachers));
        }
        return methodists;
    }
}
