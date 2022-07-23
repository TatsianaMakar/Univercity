package model;

import base.Adress;
import base.People;

import java.util.ArrayList;

public class Methodist extends People {
       ArrayList<Teacher> teacherArrayList;
    // private int teacherAge;
    // private int salary;
    // private Adress teacherAdr;


    public Methodist(ArrayList<Teacher> teacherArrayList) {
        this.teacherArrayList = teacherArrayList;
    }

    public Methodist(String surname, String name, int age, Adress adress, String gender, ArrayList<Teacher> teacherArrayList) {
        super(surname, name, age, adress, gender);
        this.teacherArrayList = teacherArrayList;
    }


    @Override
    public String toString() {
        return "\nMenthodist surname: "+getSurname()+" name: "+getName()+" age: "+getAge();
    }
}
