package dev;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class uudt {

    public static void main(String[] args) {

        String[] originalArr = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArr);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArr));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArr));

//        // not possible to add/remove since list was created based on not resizable array (but mutable)
//        originalList.remove(0);
//        originalList.add("fourth");

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);
    }
}
