import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // int[] arr = { 2, 4, 1, 9, 5, 7 };
        // // selectionSort(arr);
        // // insertionSort(arr);
        // // mergeSort(arr);

        // System.out.println(Arrays.toString(mergeSort(arr)));
        // }

        // public static int[] mergeSort(int[] arr) {
        // int n = arr.length;

        // int mid = n / 2;
        // int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        // int[] right = mergeSort(Arrays.copyOfRange(arr, mid, n));

        // return helpMerge(left, right);
        // }

        // public static int[] helpMerge(int[] left, int[] right) {
        // int n = left.length;
        // int m = right.length;

        // int i = 0, j = 0, k = 0;

        // int[] result = new int[m + n];
        // while (i < n && j < m) {
        // if (left[i] < right[j]) {
        // result[k++] = left[i++];
        // } else {
        // result[k++] = right[j++];
        // }
        // }
        // while (i < n) {
        // result[k++] = left[i++];
        // }
        // while (j < m) {
        // result[k++] = right[j++];
        // }

        // return result;

        int[] arr = { 2, 4, 1, 9, 5, 7 };

        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return arr; // Base case: arrays with 0 or 1 element are already sorted
        }

        int mid = n / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, n));

        return helpMerge(left, right);
    }

    public static int[] helpMerge(int[] left, int[] right) {
        int n = left.length;
        int m = right.length;

        int i = 0, j = 0, k = 0;

        int[] result = new int[m + n];
        while (i < n && j < m) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // Merge remaining elements from left array
        while (i < n) {
            result[k++] = left[i++];
        }

        // Merge remaining elements from right array
        while (j < m) {
            result[k++] = right[j++];
        }

        return result;
    }
}
