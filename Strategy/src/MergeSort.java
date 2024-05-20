import java.util.ArrayList;

/*
    This is a concrete implementation of algorithm
 */
public class MergeSort implements Sorting {

    MergeSort() {

    }

    public void merge(int l1, int r1, int l2, int r2, int[] arr) {
        int curr1 = l1, curr2 = l2;
        ArrayList<Integer> subArraySorted = new ArrayList<>();
        while (curr1 <= r1 && curr2 <= r2) {
            if (arr[curr1] <= arr[curr2])
                subArraySorted.add(arr[curr1++]);
            else
                subArraySorted.add(arr[curr2++]);
        }
        if (curr2 <= r2) {
            curr1 = curr2;
            r1 = r2;
        }
        while (curr1 <= r1)
            subArraySorted.add(arr[curr1++]);

        for (int i = 0; i < subArraySorted.size(); ++i)
            arr[i + l1] = subArraySorted.get(i);
    }

    public void mergeSort(int l, int r, int[] arr) {
        if (l >= r)
            return;
        int mid = (l + r) >> 1;
        mergeSort(l, mid, arr);
        mergeSort(mid + 1, r, arr);
        merge(l, mid, mid + 1, r, arr);
    }

    @Override
    public void sort(int[] arr) {
        mergeSort(0, arr.length - 1, arr);
    }
}
