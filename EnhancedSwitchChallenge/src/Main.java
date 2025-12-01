public class Main {

    public static void main(String[] args) {

        printDayOfWeek(-1);
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        printWeekDay(-1);
        printWeekDay(0);
        printWeekDay(3);
        printWeekDay(6);
        printWeekDay(7);
    }

    public static void printDayOfWeek(int day) {

        String dayOfTheWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println(day + " stands for " + dayOfTheWeek);
    }

    public static void printWeekDay(int day) {

        String weekDay = "Invalid Day";
        if (day == 0) {
            weekDay = "Sunday";
        } else if (day == 1) {
            weekDay = "Monday";
        } else if (day == 2) {
            weekDay = "Tuesday";
        } else if (day == 3) {
            weekDay = "Wednesday";
        } else if (day == 4) {
            weekDay = "Thursday";
        } else if (day == 5) {
            weekDay = "Friday";
        } else if (day == 6) {
            weekDay = "Saturday";
        }
        System.out.println(day + " stands for " + weekDay);
    }

}
