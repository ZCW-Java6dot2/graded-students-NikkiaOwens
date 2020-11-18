package io.zipcoder;

import java.lang.reflect.Array;
import java.util.*;

public class Classroom {
    /*
    public int maxNumberOfStudents;
    ArrayList<Student> students;
    */
    public Student[] students;

    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];

    }

    public Classroom(Student[] students) {
       //Student students = new Student();
       this.students = students;
    }

    //nullary constructs, empty array of 30 student objects
    public Classroom() {
        students = new Student[30];

    }

    public Student[] getStudents() {
        return this.students;
    }

    public double getStudentAverageExamScores() {
        //add all exam scores together then / numberofStudents or student.length?
        // all exam averages of all students / numOfStudents
        double sum = 0.0;
        //if (students.isEmpty()) return sum;
        for (Student s : students) {
            sum = sum + s.getAverageExamScore();
        }
        return sum / students.length;

    }

    public void addStudent(Student newStudent) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = newStudent;
                break;
            }
        }
    }

    public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                students[i] = null;
                break;
            }
        }
    }


    public Student[] getStudentsByScore() {
        Arrays.sort(this.students);
        return this.students;
    }

    public Map<String, Character> getGradeBook(){

        Map<String, Character> studentGradeBook = new HashMap<>();
        int count;
        int percent;

        for(int i = 0; i < students.length; i++){
            count = 0;
            for(int j =0; j < students.length; j++){
                if(students[i].getAverageExamScore() > students[j].getAverageExamScore()){
                    count++;
                }
            }
                percent = (count * 100) / (students.length - 1);
            if (percent > 89){
                studentGradeBook.put(students[i].toString(), 'A');
            } else if ( percent <= 89 && percent > 70){
                studentGradeBook.put(students[i].toString(), 'B');
            }
            else if (percent <= 70 && percent > 49) {
                studentGradeBook.put(students[i].toString(), 'C');
            }
            else if (percent <=49 && percent > 11) {
                studentGradeBook.put(students[i].toString(), 'D');
            } else {
                studentGradeBook.put(students[i].toString(), 'F');
            }
            }
            return studentGradeBook;
        }
    }







