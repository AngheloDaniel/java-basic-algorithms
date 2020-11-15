package com.anghelodaniel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Utils {

    public int[] createRandomIntArray(int length) {
        int[] arr = new int[length];

        for (int x = 0; x < length; x++) {
            arr[x] = (int) (Math.random() * 100);
        }

        return arr;
    }

    public int[] createSortedArray(int length) {
        int[] arr = new int[length];
        int min = 1;
        int max = 10;

        for (int x = 0; x < length; x++) {
            if (x - 1 < 0) {
                arr[x] = generateRandomNumber(min, max);
            } else {
                arr[x] = arr[x-1] + generateRandomNumber(min, max);
            }
        }

        return arr;
    }

    public int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

    public static BufferedReader reader () {
        return new BufferedReader(
                new InputStreamReader(System.in)
        );
    }
}
