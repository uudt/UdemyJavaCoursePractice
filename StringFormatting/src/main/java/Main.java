public class Main {

    public static void main(String[] args) {

        String formattedString = "Print a Formatted List:\n" +
            "\t\u2022 First Point\n" +
            "\t\t\u2022 Sub Point";
        System.out.println(formattedString);

        String textBlock = """
            Print a Text Block:
                    \u2022 First Point
                        \u2022 Sub Point""";
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d%n", age);

        int year = 2025 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, year);

        System.out.printf("Your age is %.2f%n", (float) age);

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        String fmttdString = String.format("Your age is %d", age);
        System.out.println(fmttdString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
