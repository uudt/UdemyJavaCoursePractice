public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65,-45));
        System.out.println(getDurationString(65,145));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Provided time duration is not valid: " + seconds + " seconds can't be a negative integer";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Provided time duration is not valid: " + minutes + " minutes can't be a negative integer";
        }
        if (seconds < 0 || seconds > 59) {
            return "Provided time duration is not valid: " + seconds + " seconds can't be a negative integer or greater than 59";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
