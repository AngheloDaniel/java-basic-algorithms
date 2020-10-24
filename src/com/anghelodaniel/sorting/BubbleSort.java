package com.anghelodaniel.sorting;

import com.anghelodaniel.Utils;

public class BubbleSort {
    Utils utils = new Utils();

    public void sort (int[] list) {
        System.out.println("\nCurrent ordered of the list: ");
        utils.printArray(list);

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

        System.out.println("\nAfter sorting the list: ");
        utils.printArray(list);
        if (sorted) {
            sort(list);
        }

    }
}
