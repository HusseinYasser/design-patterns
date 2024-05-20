/*
    This is the context that is completely isolated from the algo implementations
    Here we don't know even about the sorting algorithm that will be used
 */
public class ArraySorter {

    Sorting sortingAlgorithm;

    public void setSortingAlgorithm(Sorting sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    ArraySorter(Sorting sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public void sort(int[] arr) {
        this.sortingAlgorithm.sort(arr);
    }

}
