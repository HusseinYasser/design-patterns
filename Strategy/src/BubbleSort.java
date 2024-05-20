public class BubbleSort implements Sorting {


    @Override
    public void sort(int[] arr) {
        for(int i = 0; i < arr.length; ++i)
        {
            boolean swapped = false;
            for(int j = 0; j < arr.length - 1 - i; ++j)
                if(arr[j] > arr[j+1])
                {
                    swapped = true;
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            if(!swapped)
                return;
        }
    }
}
