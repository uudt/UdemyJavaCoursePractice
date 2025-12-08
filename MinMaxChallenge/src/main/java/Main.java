import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minNum = 0;
        int maxNum = 0;
        int i = 0;

        while (true) {
            System.out.println("Enter a number: ");
            String userInput = scanner.nextLine();
            try {
                int num = Integer.parseInt(userInput);
                if (i == 0 || num < minNum) {
                    minNum = num;
                }
                if (i == 0 || num > maxNum) {
                    maxNum = num;
                }
                i++;
            } catch (NumberFormatException e) {
                break;
            }
        }

        if (i > 0) {
            System.out.println("Min = " + minNum);
            System.out.println("Max = " + maxNum);
        } else {
            System.out.println("No valid data entered");
        }
    }

}
