package strategy;

public class InsertionSortStrategy implements SortingStrategy {

    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1, num = arr[i];
            while (j >= 0 && num < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = num;
        }
    }

    @Override
    public String toString() {
        return "Sorted with Insertion Sort strategy";
    }

}
