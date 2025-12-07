public class Main {

    public static void main(String[] args) {
        int int2 = 5;
        double km = (100 * 1.609344);

        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore;  // add bonus
        }

        int health = 100; //(expression)

        if ((health < 25) && (highScore > 1000)) {   //(3 expressions)
            highScore = highScore - 1000;   //expression
        }

        int myVar = 50; // statement
        myVar++;
        myVar--;

        System.out.println("This is a test");
        System.out.println("This is" +
            " another " +
            "still more.");

        int anotherVar = 50;
        myVar--;
        System.out.println(myVar);

        if (myVar == 0) {
            System.out.println("It's now zero.");
        }
    }
}
