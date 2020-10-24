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

    public void printArray(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + ", ");
        }
    }

    public static BufferedReader reader () {
        return new BufferedReader(
                new InputStreamReader(System.in)
        );
    }
}
