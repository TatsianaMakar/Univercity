package model;

import base.Adress;
import base.People;

public class Student extends People {
	public Student() {
	}

	public Student(String surname, String name, int age, Adress adress, String gender) {
		super(surname, name, age, adress, gender);
	}

	@Override
	public String toString() {
		return "\nStudents surname: "+getSurname()+" name: "+getName()+" age: "+getAge();
	}


}
