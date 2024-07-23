import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 9, 2, 3, 7, 4 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int part = partitionArr(arr, low, high);

            quickSort(arr, low, part - 1);
            quickSort(arr, part + 1, high);
        }
    }

    public static int partitionArr(int[] arr, int low, int high) {
        int pivot = arr[high];
        int j = low - 1;
        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                j++;
                swap(arr, i, j);
            }
        }
        swap(arr, j + 1, high);
        return j + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
