public class Main {

    public static void main(String[] args) {

        String s = "Hello World!";

        // String Inspection Methods
        printInfo(s);
        printInfo("\t   \n ");

        System.out.printf("Index of r = %d %n", s.indexOf('r'));
        System.out.printf("Index of l = %d %n", s.indexOf('l'));
        System.out.printf("Index of l = %d %n", s.indexOf('l', 3));
        System.out.printf("Index of l = %d %n", s.indexOf('l', 4));
        System.out.printf("Index of last l = %d %n", s.lastIndexOf('l'));
        System.out.printf("Index of last l = %d %n", s.lastIndexOf('l', 8));
        System.out.printf("Index of World = %d %n", s.indexOf("World"));
        System.out.printf("Index of last World = %d %n", s.lastIndexOf("World"));

        System.out.println();
        System.out.println();
        System.out.println();

        //String equation methods
        String hWLower = s.toLowerCase();
        if (s.equals(hWLower)) {
            System.out.println("Values match exactly");
        }
        if (s.equalsIgnoreCase(hWLower)) {
            System.out.println("Values match ignoring case");
        }
        if (s.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (s.endsWith("!")) {
            System.out.println("String ends with !");
        }
        if (s.contains("World")) {
            System.out.println("String contains World");
        }
        if (s.contentEquals("Hello World!")) {
            System.out.println("Values match exactly");
        }

        //String Manipulation Methods in separate class in this project
    }

    public static void printInfo(String s) {
        int length = s.length();

        if (s.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }

        if (s.isBlank()) {
            System.out.println("String is Blank");
        }
        System.out.printf("Length = %d%n", length);
        System.out.printf("First char = %c %n", s.charAt(0));
        System.out.printf("Last char = %c%n", s.charAt(length - 1));
    }

}
