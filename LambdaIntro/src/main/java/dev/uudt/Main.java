package dev.uudt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    record Person (String firstName, String lastName) {

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
            new Main.Person("Lucy", "Van"),
            new Person("Lala", "Liu"),
            new Person("Putty", "Bu")));

        // Using anonymous class
        var comparatorlastName = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName());
            }
        };

//        people.sort(comparatorlastName);
//        System.out.println(people);

//        // Passing annonymous class directly as an argument without creating class
//        people.sort(new Comparator<Person>() {
//
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.lastName().compareTo(o2.lastName());
//            }
//        });
//        System.out.println(people);

        // Using Lambda expression
        people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));
        System.out.println(people);

        interface EnhancedComparator<T> extends Comparator<T> {
            int secondLevell(T o1, T o2);
        }

        var comparatorMixed = new EnhancedComparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName().compareTo(o2.lastName());
                return (result == 0 ? secondLevell(o1, o2) : result);
            }

            @Override
            public int secondLevell(Person o1, Person o2) {
                return o1.firstName().compareTo(o2.firstName());
            }
        };

        people.sort(comparatorMixed);
        System.out.println(people);

    }
}
