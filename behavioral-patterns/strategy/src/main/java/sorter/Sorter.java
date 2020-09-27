package sorter;

import strategy.SelectionSortStrategy;
import strategy.SortingStrategy;

import java.util.Arrays;

public class Sorter {

    private SortingStrategy sortingStrategy;

    public Sorter() {
        sortingStrategy = new SelectionSortStrategy();
    }

    public Sorter(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
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
