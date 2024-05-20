
public class QuickSort implements Sorting {
    //Quick sort algorithm with 3-median pivot selection technique

    public int minOfThree(int a, int b, int c, int[] arr) {
        int bstIdx = a, bstVal = arr[a];
        if (arr[b] < bstVal) {
            bstIdx = b;
            bstVal = arr[b];
        }
        if (arr[c] < bstVal)
            return c;
        return bstIdx;
    }

    public void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void quickSort(int l, int r, int[] arr) {
        if (l >= r)
            return;

        int mid = (l + r) >> 1;
        quickSort(l, mid, arr);
        quickSort(mid + 1, r, arr);

        int pivot = minOfThree(l, mid, r, arr);
        swap(pivot, r, arr);

        int rightPartition = r - 1, leftPartition = l;
        while (leftPartition < rightPartition) {
            if (arr[leftPartition] <= arr[r])
                leftPartition++;
            else if (arr[rightPartition] >= arr[r])
                rightPartition--;
            else {
                swap(leftPartition, rightPartition, arr);
                leftPartition++;
                rightPartition--;
            }
        }
        swap(leftPartition, r, arr);
    }

    @Override
    public void sort(int[] arr) {
        quickSort(0, arr.length - 1, arr);
    }
}
