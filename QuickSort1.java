import java.util.Arrays;

public class QuickSort1 {
    public static void main(String[] args) {
        int[] arr = { 10, 8, 9, 1, 5, 7, 3 };

        int n = arr.length;
        quickSort(arr, 0, n - 1);
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
        int pIndex = arr[high];
        int j = low - 1;
        for (int i = low; i < high; i++) {
            if (arr[i] < pIndex) {
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
