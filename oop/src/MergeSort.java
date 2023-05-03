public class MergeSort {
    public void merge(int[] arr, int l, int m, int r) {
        // Determine the size of the two sub-arrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
        // Create temporary arrays to store the left and right sub-arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        // Copy the elements of the left and right sub-arrays into the temporary arrays
        for (int i = 0; i < n1; ++i)
            leftArr[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[m + 1 + j];
        // Merge the two temporary arrays into the original array
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        // Copy the remaining elements of the left sub-array into the original array (if any)
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        // Copy the remaining elements of the right sub-array into the original array (if any)
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
    public void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            // Determine the middle index
            int m = (l + r) / 2;
            // Recursively sort the left and right sub-arrays
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted left and right sub-arrays
            merge(arr, l, m, r);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
        int n = arr.length;
        System.out.println("Original Array:");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        MergeSort obj = new MergeSort();
        obj.mergeSort(arr, 0, n - 1);
        System.out.println("\nSorted Array:");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
    }
}
