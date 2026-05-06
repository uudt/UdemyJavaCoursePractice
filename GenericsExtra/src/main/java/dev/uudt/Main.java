package dev.uudt;

import dev.uudt.model.PAStudent;
import dev.uudt.model.Student;
import dev.uudt.util.QueryItem;
import dev.uudt.util.QueryList;

import java.util.ArrayList;
import java.util.List;

record Employee(String name) implements QueryItem {

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return false;
    }
}

public class Main {

    public static void main(String[] args) {

        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
        students.add(new PAStudent());
//        printList(students);
        printMoreLists(students);

        List<PAStudent> paStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            paStudents.add(new PAStudent());
        }
//        printList(paStudents);
        printMoreLists(paStudents);

        testList(new ArrayList<String>(List.of("Able", "Barry", "Charlie")));
        testList(new ArrayList<Integer>(List.of(1, 2, 3)));

        var queryList = new QueryList<>(paStudents);
        var matches = queryList.getMatches("Course", "Python");
        printMoreLists(matches);

        var students2021 = QueryList.getMatches(students, "YearStarted", "2021");
//        var students2021 = QueryList.<Student>getMatches(new ArrayList<>(), "YearStarted", "2021");
        printMoreLists(students2021);

//        QueryList<Employee> employeeList = new QueryList<>();

    }

    public static void printMoreLists(List<? extends Student> students) {

//        Student last = students.get(students.size() - 1);
//        students.set(0, last);

        for (var student : students) {
            System.out.println(student.getYearStarted() + ": " + student);
//            System.out.println(student);
        }
        System.out.println();
    }

//    public static <T extends Student> void printList(List<T> students) {
//
//        for (var student : students) {
//            System.out.println(student.getYearStarted() + ": " + student);
//        }
//        System.out.println();
//    }

    public static void testList(List<?> list) {

        for (var element : list) {
            if (element instanceof String s) {
                System.out.println("String: " + s.toUpperCase());
            } else if (element instanceof Integer i) {
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }

//    public static void testList(List<String> list) {
//
//        for (var element : list) {
//            System.out.println("String: " + element.toUpperCase());
//        }
//    }
//
//    public static void testList(List<Integer> list) {
//
//        for (var element : list) {
//            System.out.println("Integer: " + element.floatValue());
//        }
//    }

}
