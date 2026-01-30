package dev.uudt;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

//        LinkedList<String> places = new LinkedList<>();
        var places = new LinkedList<String>();

        places.add("Zurich");
        places.add(0, "Sochi");
        System.out.println(places);

        addMore(places);
        System.out.println(places);

//        removeElements(places);
//        System.out.println(places);

        gettingElements(places);

//        printItinerary(places);
//        printItinerary2(places);
        printItinerary3(places);
    }

    private static void addMore(LinkedList<String> list) {

        list.addFirst("South France");
        list.addLast("Norway");

        //Queue methods
        list.offer("SPb");
        list.offerFirst("Dublin");
        list.offerLast("Moscow");

        //Stack methods
        list.push("city from a stack");
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Dublin");

        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + " was removed.");

        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed.");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed.");

        //Queue/Deque poll methods
        String p1 = list.poll();
        System.out.println(p1 + " as p1 was removed.");

        String p2 = list.pollFirst();
        System.out.println(p2 + " as p2 was removed.");

        String p3 = list.pollLast();
        System.out.println(p3 + " as p3 was removed.");

        list.push("city from a stack");
        list.push("city2");
        list.push("city3");

        String popp = list.pop();
        System.out.println(popp + " as popp was removed.");
    }

    private static void gettingElements(LinkedList<String> list) {

        System.out.println("Retrieved element = " + list.get(4));

        System.out.println("First element = " + list.getFirst());
        System.out.println("Last element = " + list.getLast());

        System.out.println("Sochi is at position: " + list.indexOf("Sochi"));
        System.out.println("SPb is at position: "  + list.lastIndexOf("SPb"));

        //Queue retrieval method
        System.out.println("Element from element(): " + list.element());

        //Stack methods
        System.out.println("Element from peek(): " + list.peek());
        System.out.println("Element from peekFirst(): " + list.peekFirst());
        System.out.println("Element from peekLast(): " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }
}
