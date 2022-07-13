package project;

import java.util.ArrayList;

public class Methodist extends People {
    private String methodistSurname;
    private String methodistName;
    ArrayList<Teacher> teacherArrayList;
    // private int teacherAge;
    // private int salary;
    // private Adress teacherAdr;

    Methodist(String methodistSurname, String methodistName, ArrayList<Teacher> teacherArrayList) {
        this.methodistSurname = methodistSurname;
        this.methodistName = methodistName;
        this.teacherArrayList = teacherArrayList;
    }

    Methodist(String methodistSurname, String methodistName) {
        this.methodistSurname = methodistSurname;
        this.methodistName = methodistName;
    }

    public void setMethodistSurname(String methodistSurname) {
        this.methodistSurname = methodistSurname;
    }

    public String getMethodistSurname() {
        return this.methodistSurname;
    }

    public void setMethodistName(String methodistName) {
        this.methodistName = methodistName;
    }

    public String getMethodistName() {
        return this.methodistName;
    }

    public String toString() {
        return "\nInformation about Methodist:" + "\nsurname: " + methodistSurname + "; name: " + methodistName
                + teacherArrayList;
    }
}
