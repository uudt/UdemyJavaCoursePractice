public class Main {

    public static void main(String[] args) {

        for (double rate = 2.0; rate <= 5.0; rate++) {
//            System.out.println(rate);
            System.out.println("$10,000 at " + rate + "% interest = $" + calculateInterest(10000.0, rate));
        }

        for (double r = 7.5; r <= 10; r += 0.25) {
            double interestAmount = calculateInterest(100, r);
            if (interestAmount > 9.0) {
                break;
            }
            System.out.println("$100 at " + r + "% interest = $" + interestAmount);
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}
