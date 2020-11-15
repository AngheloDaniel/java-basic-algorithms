package com.anghelodaniel.searching;

import com.anghelodaniel.Utils;

import java.util.Arrays;

public class BinarySearch {

    public int search(int[] list, int number) {

        int length = list.length -1;

        if (length > 1) {
            int half = length / 2;
            
            if (list[half] == number) {
                return half;
            } else if (list[half] <= number) {
                int[] halfList = Arrays.copyOfRange(list, 0, half-1);
                search(halfList, number);
            } else if (list[half] > number) {
                int[] halfList = Arrays.copyOfRange(list, half, length-1);
                search(halfList, number);
            }

        } else {
            if (list[length] == number) {
                return 0;
            }
        }

        return -1;
    }

    public void displayExample(int[] sortedList, int number) {
        System.out.print("Searching for number: " + number
                + " in list ");
        Utils.printArray(sortedList);
        System.out.print("Result: ");

        int result = search(sortedList, number);

        if (result > 0) {
            System.out.println("Number found at position " + result);
        } else {
            System.out.println("Number not found");
        }
    }
}
