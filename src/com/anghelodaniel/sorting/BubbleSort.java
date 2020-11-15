package com.anghelodaniel.sorting;

public class BubbleSort {
    int iterations = 0;

    public int[] sort (int[] list) {
        boolean sorted = false;
        int length = list.length;
        int tmp;

        for(int x = 0; x < length; x++) {
            if (x+1 < length && list[x+1] < list[x]) {
                tmp = list[x];
                list[x] = list[x+1];
                list[x+1] = tmp;
                sorted = true;
            }
        }

        if (sorted) {
            iterations++;
            sort(list);
        }

        return list;
    }
}
