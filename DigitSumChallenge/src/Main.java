public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int number) {

        if (number < 0) {
            return -1;
        }

//        String stringNum = number + "";   //"123"
//        int sumDigitsCount = sumDigitsCount(0);

//        for (int i = 0; i < stringNum.length(); i++) {
//            sumDigitsCount += (int) (stringNum.charAt(i));
//        }

        int sum = 0;
        while (number > 9) {
            sum += number % 10;
            number = number / 10;
        }
        sum += number;

        return sum;
    }

}
