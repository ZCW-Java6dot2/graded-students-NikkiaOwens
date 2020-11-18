package io.zipcoder;

import java.util.Comparator;

public class SortByScores implements Comparator<Student> {

    public int compare(Student a, Student b) {
        return (int) (a.getAverageExamScore() - b.getAverageExamScore());
    }

}
