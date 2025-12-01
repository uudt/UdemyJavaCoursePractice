public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;
        for (int num = 1; num <= 1000 && counter < 5; num++) {
            if (dividedBy3Or5(num)) {
                sum += num;
                System.out.println("Number = " + num);
                counter ++;
            }
//            if (counter == 5) {
//                break;
//            }
        }
        System.out.println("The sum = " + sum);
    }

    public static boolean dividedBy3Or5(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return true;
        }
        return false;
    }

}
