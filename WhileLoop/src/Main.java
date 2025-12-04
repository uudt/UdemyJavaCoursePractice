public class Main {

    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//
//        int j = 1;
//        boolean isReady = false;
//        do {
//            if (j > 5) {
//                break;
//            }
//            System.out.println("j = " + j);
//            j++;
//            isReady = (j > 0);
//        } while (isReady);

        int num = 0;
        while (num < 50) {
            num += 5;
            if (num % 25 == 0) {
                continue;
            }
            System.out.print(num + " _ ");
        }
    }

}
