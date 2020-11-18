package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student implements Comparable<Student> {



    String firstName;
    String lastName;
    ArrayList<Double> examScores;
   // private Integer NumberOfExamsTaken; //remove/ undo

    public Student(String firstName, String lastName, Double[] testScores) {
       this.firstName = firstName;
        this.lastName = lastName;
      this.examScores = new ArrayList<>(Arrays.asList(testScores));
        //for (Double d: testScores) {
          // examScores.add(d);
        //}
    }
    public Student(){

    }

public void setFirstName(String firstName){this.firstName = firstName;}
public String getFirstName(){return firstName;}

public void setLastName(String lastName){this.lastName = lastName;}
public String getLastName() {return lastName;}

//
//public Integer getNumberOfExamsTaken(){ return NumberOfExamsTaken; }
public String getExamScores(){return examScores.toString();}
public void addExamScore(Double examScore){ examScores.add(examScore);}
public void setExamScore(int examNumber, double examScore){examScores.set(examNumber , examScore);}

public double getAverageExamScore(){
        double sum = 0.0;

        if (examScores.isEmpty()) return sum;

        for(Double exam : examScores) {
            sum += exam;
        }

        return sum / examScores.size();
    }


//@Override

public String toString(){
        String str = "First Name: " + firstName + "\n" +
                     "Last Name: " + lastName;
        return str;
}

    @Override
    public int compareTo(Student studentB) {
        return Double.compare(this.getAverageExamScore(), studentB.getAverageExamScore());
    }
}

