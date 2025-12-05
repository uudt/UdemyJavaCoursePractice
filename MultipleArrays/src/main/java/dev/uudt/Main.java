package dev.uudt;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] arr2 = new int[4][4];
        System.out.println(Arrays.toString(arr2));
        System.out.println("Array length = " + arr2.length);

        for (int[] arr : arr2) {
            System.out.println(Arrays.toString(arr));
        }

        // regular nested loop
        for (int i = 0; i < arr2.length; i++) {
            var arr = arr2[i];
            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr2[i][j] + " ");
                arr2[i][j] = (i * 10) + (j + 1);
            }
//            System.out.println();
        }

        // assign values in loops
        for (int i = 0; i < arr2.length; i++) {
            var arr = arr2[i];
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // enhanced nested loop
        for (var arr : arr2) {
            for (var element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println();

        // built-in method to print two-dimentional array
        System.out.println(Arrays.deepToString(arr2));

    }
}
