package base;

import model.Teacher;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {
    Teacher teacher=new Teacher("Dovgel", "Tatsiana", -6, "woman", 800);


    @Test
    public void getAge() {
        Assert.assertFalse(teacher.getAge()<0);
    }
}