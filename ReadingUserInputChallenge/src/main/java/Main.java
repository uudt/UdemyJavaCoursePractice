import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int sum = 0;
        double sum = 0;
        int counter = 1;

//        while (counter <= 5) {
        do {
            System.out.println("Enter number #" + counter + ": ");
            String userInput = scanner.nextLine();
            try {
//                int num = Integer.parseInt(userInput);
                double num = Double.parseDouble(userInput);
                sum += num;
                counter++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        } while (counter <= 5);

        System.out.println("The sum of 5 entered by user numbers = " + sum);
    }

}
