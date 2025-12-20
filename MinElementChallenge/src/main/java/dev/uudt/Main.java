package dev.uudt;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {

        int[] intArr = readIntegers();
        System.out.println("Array from user's input: " + Arrays.toString(intArr));

        int minV = findMin(intArr);
        System.out.println("Min int in the array = " + minV);

    }

    private static int[] readIntegers() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter comma delimited integers: ");
        String strArr = sc.nextLine();

        String[] intStrArr = strArr.split(",");
        int[] intArr = new int[intStrArr.length];

        for (int i = 0; i < intStrArr.length; i++) {
            intArr[i] = Integer.parseInt(intStrArr[i].trim());
        }
        return intArr;
    }

    private static int findMin(int[] intArr) {

        sort(intArr);
        int minv = intArr[0];
        return minv;
    }

}
