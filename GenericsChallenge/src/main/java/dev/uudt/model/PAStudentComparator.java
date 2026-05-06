package dev.uudt.model;

import java.util.Comparator;

public class PAStudentComparator implements Comparator<PAStudent> {

    @Override
    public int compare(PAStudent o1, PAStudent o2) {
        return (int) (o1.getPercentComplete() - o2.getPercentComplete());
    }

}
