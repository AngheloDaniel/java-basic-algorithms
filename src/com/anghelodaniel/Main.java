package com.anghelodaniel;

import com.anghelodaniel.sorting.BubbleSort;

public class Main {

    Utils utils = new Utils();

    public static void main(String[] args) {
        System.out.println("Sorting and Searching methods");
        System.out.println("Menu:");
        System.out.println("3. Bubble sort");
        System.out.println("Choose an option: ");

        new Main().chooseMethod(3);
    }

    public void chooseMethod(int option) {
        switch (option) {
            case 3: displayBubbleSort(); break;
        }
    }

    public void displayBubbleSort() {
        BubbleSort sortMethod = new BubbleSort();
        int[] numbers = utils.createRandomIntArray(10);
        sortMethod.sort(numbers);
    }
}
