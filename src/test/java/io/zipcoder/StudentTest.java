package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {
    Student student;
    //ArrayList<Double> scores;
    Double[] scores;

    @Before
    public void initialize(){
       // scores = new ArrayList<>(5);
        //student = new Student("Big", "Cat", scores);
    }

    @Test
    public void setFirstNameTest() {
        Student student = new Student();
        String expected = "Papa";

        student.setFirstName(expected);

        String actual = student.getFirstName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setLastNameTest() {
        Student student = new Student();
        String expected = "Smith";

        student.setLastName(expected);

        String actual = student.getLastName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void constructorTest(){

    }



}