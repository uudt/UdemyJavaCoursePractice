public class Main {

    public static void main(String[] args) {

        int testNum = 5;
        int totalEven = 0;
        int totalOdd = 0;
        int counterEven = 0;

        while (testNum <= 20 && counterEven < 5) {
            if (isEvenNumber(testNum)) {
                totalEven += testNum;
                System.out.println(testNum);
                counterEven++;
            } else {
                totalOdd += testNum;
            }
            testNum++;
        }
        System.out.println("Total even numbers = " + totalEven);
        System.out.println("Total odd numbers = " + totalOdd);
    }

    public static boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

}
