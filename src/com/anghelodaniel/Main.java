package com.anghelodaniel;

import com.anghelodaniel.searching.BinarySearch;
import com.anghelodaniel.searching.LinearSearch;
import com.anghelodaniel.sorting.BubbleSort;

public class Main {

    Utils utils = new Utils();

    public static void main(String[] args) {
        int option = 1;

        Main.displayInstructions();

        try {
            option = Integer.parseInt(Utils.reader().readLine());
        } catch (Exception e) {
            System.out.println("Exception: Can't read line - msg: "
                    + e.getMessage());
        }

        new Main().chooseMethod(option);
    }

    public void chooseMethod(int option) {
        switch (option) {
            case 1: displayBubbleSort(); break;
            case 2: displayLinearSearch(); break;
            case 3: displayBinarySearch(); break;
        }
    }

    public void displayBinarySearch() {
        BinarySearch binarySearch = new BinarySearch();
        int[] sortedList = utils.createSortedArray(30);
        binarySearch.displayExample(sortedList, 85);
    }

    public void displayBubbleSort() {
        BubbleSort sortMethod = new BubbleSort();
        int[] numbers = utils.createRandomIntArray(10);
        System.out.print("\nUnordered list: ");
        Utils.printArray(numbers);
        System.out.print("\nSorted list: ");
        Utils.printArray(sortMethod.sort(numbers));

    }

    public void displayLinearSearch() {
        LinearSearch linearSearch = new LinearSearch();
        int[] list = utils.createRandomIntArray(20);
        int number = 50;

        System.out.print("\nSearch for number " + number
                + " in this list : ");
        Utils.printArray(list);

//        call the search method
        int result = linearSearch.search(list, 50);

//        if found, method returns the positon
//        if not, it returns -1
        if (result < 0) {
            System.out.println("Element doesn't exist in the list");
        } else {
            System.out.println("element was found in the position " + result);
        }
    }

    public static void displayInstructions() {
        System.out.println(":::Algorithms catalog:::");
        System.out.println("Menu:");
        System.out.println("1. Sorting");
        System.out.println("2. Searching");
        System.out.println("3. Binary Search");
        System.out.print("Choose an option: ");
    }
}
