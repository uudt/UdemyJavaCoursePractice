import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // defined array
        int[] arr = {1,3,5,2,4};
        System.out.println(Arrays.toString(arr));
        int[] reversed = reverse(arr);
        System.out.println(Arrays.toString(reversed));

        // inputted by user array
        int counter = readInteger();
        int[] arrOfNums = readElements(counter);
        System.out.println(Arrays.toString(arrOfNums));
        reverse(arrOfNums);
        System.out.println(Arrays.toString(arrOfNums));
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer counter value: ");
        int input = scanner.nextInt();
        return input;
    }

    private static int[] readElements(int num) {
        int[] arr = new int[num];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            System.out.println("Enter integer value into array: ");
            int input = scanner.nextInt();
            arr[i] = input;
        }
        return arr;
    }

    public static void reverse(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length && i < arr.length - 1 - i; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
