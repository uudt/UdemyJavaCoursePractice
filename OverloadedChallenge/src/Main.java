public class Main {

    public static void main(String[] args) {

        System.out.println("Height in cm of 71 inches is " + convertToCentimeters(71));
        System.out.println("Height in cm of 5 feet and 7 inches is " + convertToCentimeters(5, 7));
    }

    public static double convertToCentimeters(int heightInch) {
        // convert inches to cm
        return heightInch * 2.54;
    }

    public static double convertToCentimeters(int heightFeet, int heightInch) {
        // convert inches to cm
        int inches = (heightFeet * 12) + heightInch;

        double cm = convertToCentimeters(inches);
        return cm;
    }
}
