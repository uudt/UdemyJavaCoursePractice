package dev.uudt;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] fArr = getRandomArray(10);
        System.out.println(Arrays.toString(fArr));

        Arrays.sort(fArr);
        System.out.println(Arrays.toString(fArr));

        int[] sArr = new int[10];
        System.out.println(Arrays.toString(sArr));
        Arrays.fill(sArr, 5);
        System.out.println(Arrays.toString(sArr));

        int[] thArr = getRandomArray(10);
        System.out.println(Arrays.toString(thArr));

        int[] fouArr = Arrays.copyOf(thArr, thArr.length);
        System.out.println(Arrays.toString(fouArr));

        Arrays.sort(fouArr);
        System.out.println(Arrays.toString(thArr));
        System.out.println(Arrays.toString(fouArr));

        int[] small = Arrays.copyOf(thArr, 5);
        System.out.println(Arrays.toString(small));

        int[] large = Arrays.copyOf(thArr, 16);
        System.out.println(Arrays.toString(large));

        String[] sA = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sA);
        System.out.println(Arrays.toString(sA));
        if (Arrays.binarySearch(sA, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(100);
        }

        return arr;
    }

}
