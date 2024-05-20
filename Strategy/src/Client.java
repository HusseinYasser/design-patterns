import java.util.Scanner;

/*
    this is the client that chooses what algorithm to play with from the different strategies
 */
public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < length; ++i)
            arr[i] = sc.nextInt();

        BubbleSort bubbleSorter = new BubbleSort();
        ArraySorter arraySorter = new ArraySorter(bubbleSorter);
        arraySorter.sort(arr);

        MergeSort mergeSorter = new MergeSort();
        arraySorter.setSortingAlgorithm(mergeSorter);
        arraySorter.sort(arr);

        QuickSort quickSorter = new QuickSort();
        arraySorter.setSortingAlgorithm(quickSorter);
        arraySorter.sort(arr);

        for (Integer i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
