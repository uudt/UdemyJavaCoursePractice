package dev.uudt;

import java.util.Arrays;
import java.util.Random;

import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {

        int[] arr = getRandomArray(5);
        System.out.println(Arrays.toString(arr));

        int[] descArr = sortInt(new int[] {7, 30, 35});
        System.out.println(Arrays.toString(descArr));

    }

    public static int[] getRandomArray(int len) {
        int[] arr = new int[len];
        Random random = new Random();

        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    public static int[] sortInt(int[] arr) {

        System.out.println(Arrays.toString(arr));
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        boolean flag =  true;
        int temp;
        while (flag) {
            flag = false;
            for(int i = 0; i < sortedArr.length - 1; i++) {
                if (sortedArr[i] < sortedArr[i + 1]) {
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i + 1];
                    sortedArr[i + 1] = temp;
                    flag = true;
                    System.out.println("->" + Arrays.toString(sortedArr));
                }
            }
            System.out.println("--->" + Arrays.toString(sortedArr));
        }
        return sortedArr;
    }

}
