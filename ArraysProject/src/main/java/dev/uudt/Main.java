package dev.uudt;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0] = 45;
        arr[1] = 1;
        arr[5] = 50;

//        double[] dArr = new double[10];
//        dArr[2] = 3.5;
//        System.out.println(dArr[2]);

//        int[] first5 = {1, 2, 3, 4, 5};
//        System.out.println("first = " + first5[0]);
//        int arrLength = first5.length;
//        System.out.println("length of array = " + arrLength);
//        System.out.println("last = " + first5[arrLength - 1]);

        int[] newArr;
//        newArr = new int[]{1, 2, 3};
        newArr = new int[5];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = newArr.length - i;
            System.out.print(newArr[i] + " ");
        }

        System.out.println();
        System.out.println();
        for (int item : newArr) {
            System.out.print(item + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(newArr));

        Object oVar = newArr;
        if (oVar instanceof int[]) {
            System.out.println("oVar is really an int array");
        }

        Object[] oStr = new Object[3];
        oStr[0] = "Hello";
        oStr[1] = new StringBuilder("World");
        oStr[2] = newArr;
        if (oStr instanceof Object[]) {
            System.out.println("oStr is really an Object array and not just a String array");
        }

        
    }
}
