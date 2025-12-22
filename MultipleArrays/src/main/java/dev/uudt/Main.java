package dev.uudt;

import java.util.Arrays;
import java.util.function.ObjLongConsumer;

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

        arr2[1] = new int[] {10, 20, 30};
        System.out.println(Arrays.deepToString(arr2));



        /// Multi-dimensional arrays
        Object[] multiArr = new Object[3];
        System.out.println(Arrays.toString(multiArr));

        multiArr[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(multiArr));

        multiArr[1] = new String[][] {
            {"1", "2"},
            {"3", "4", "5"},
            {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(multiArr));

        multiArr[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(multiArr));

        for (Object item : multiArr) {
            System.out.println("Element type = " + item.getClass().getSimpleName());
            System.out.println("Element toString() = " + item);
            System.out.println(Arrays.deepToString((Object[]) item));
        }
    }
}
