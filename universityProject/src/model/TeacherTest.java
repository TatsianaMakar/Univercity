package model;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TeacherTest {

    Teacher teacher1=new Teacher("Dovgel", "Tatsiana", 35, "woman", 1000);



    @Test
    public void salaryTooLarge() {
        Assert.assertEquals(2000,teacher1.getSalary());
    }
}