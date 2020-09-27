package sorter;

import strategy.SortingStrategy;

import java.util.Arrays;

public class Sorter {

    private SortingStrategy sortingStrategy;

    public Sorter() { }

    public Sorter(SortingStrategy sortingStrategy) {
        setSortingStrategy(sortingStrategy);
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(int[] arr) {
        sortingStrategy.sort(arr);
        System.out.println(sortingStrategy);
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
        System.out.println();
    }

}
