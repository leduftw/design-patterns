package main;

import strategy.InsertionSortStrategy;
import sorter.Sorter;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {5, 3, 4, 2, 1};
        int[] arr2 = {15, 18, 11, 12};

        Sorter sorter = new Sorter();

        sorter.sort(arr1);
        System.out.println();

        sorter.setSortingStrategy(new InsertionSortStrategy());

        sorter.sort(arr2);
        System.out.println();
    }

}
