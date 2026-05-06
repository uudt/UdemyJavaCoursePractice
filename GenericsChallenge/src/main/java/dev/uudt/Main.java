package dev.uudt;

import dev.uudt.model.PAStudent;
import dev.uudt.model.PAStudentComparator;
import dev.uudt.model.Student;
import dev.uudt.util.QueryItem;
import dev.uudt.util.QueryList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        QueryList<PAStudent> queryList = new QueryList<>();
        for (int i = 0; i < 25; i++) {
            queryList.add(new PAStudent());
        }

        System.out.println("Ordered");
        queryList.sort(Comparator.naturalOrder());
        printList(queryList);

        System.out.println("Matches");
        var matches = queryList
            .getMatches("PercentComplete", "50")
            .getMatches("Course", "Python");

        matches.sort(new PAStudentComparator());
        printList(matches);

        System.out.println("Ordered");
        matches.sort(null);
        printList(matches);
    }

    public static void printList(List<?> students) {

        for (var student : students) {
            System.out.println(student);
        }
    }

}