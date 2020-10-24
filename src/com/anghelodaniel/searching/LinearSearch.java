package com.anghelodaniel.searching;

public class LinearSearch {
    public int search(int[] list, int number) {
        for (int x = 0; x < list.length; x++) {
            if (list[x] == number) {
                return x;
            }
        }

        return -1;
    }

}
