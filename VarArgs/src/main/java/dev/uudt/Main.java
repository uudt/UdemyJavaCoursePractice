package dev.uudt;

public class Main {

    public static void main(String... args) {

        System.out.println("Hello");

        String[] splitStrings = "a d v".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello World again");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("_".repeat(20));
        printText();

        System.out.println("_".repeat(20));
        String[] sArr = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArr));
    }

    private static void printText(String... text) {
        for (String t : text) {
            System.out.println(t);
        }
    }

}
