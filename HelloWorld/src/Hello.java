public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Ulyana!");

        boolean isAlien = true;
        if (isAlien == true) {
            System.out.println("It is not an alien!");
            System.out.println("I'm scared with aliens!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secTopSc = 95;
        if ((topScore > secTopSc) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secTopSc <=90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true but where the error hides sometimes!");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is true, don't forget use == when check equality");
        }

        String makeOfCar = "BMW";
        boolean isDomestic = (makeOfCar == "BMW") ? true : false;

        if (isDomestic) {
            System.out.println("This is car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "this car is not domestic";


        //1
        double fDV = 20.00;
        //2
        double sDV = 80.00;
        //3
        double sumMult = (fDV + sDV) * 100.00;
        //4
        double remainder = sumMult % 40.00;
        //5
        boolean boolRem = (remainder == 0.00) ? true : false;
        //6
        System.out.println(boolRem);
        //7
        if (!boolRem) {
            System.out.println("got some remainder");
        }

    }
}
