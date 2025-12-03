public class Main {

    public static void main(String[] args) {

        int counter = 0;
        for (int i = 10; i <= 50 && counter < 3; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                counter++;
//                if (counter == 3) {
//                    break;
//                }
            }
        }
        System.out.println("Counter consist of " + counter + " prime numbers");
//        System.out.println("0 is " + (isPrime(0) ? "" : "NOT")+ " a prime number");
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int div = 2; div <= wholeNumber / 2; div++) {
            if (wholeNumber % div == 0) {
                return false; // not prime since is divisable by smth except 1 and itself
            }
        }
        return true; // is prime
    }
}
