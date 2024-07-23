import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 7, 8, 9, 1, 12 };
        int k = 3;
        System.out.println(kthLargest(arr, k));
    }

    public static int kthLargest(int[] arr, int k) {
        int n = arr.length;
        return quickSelect(arr, 0, n - 1, n - k);
    }

    public static int quickSelect(int[] arr, int low, int high, int k) {
        while (low <= high) {
            int part = partition(arr, low, high);
            if (part == k) {
                return arr[part];
            } else if (part > k) {
                return quickSelect(arr, low, part - 1, k);
            } else {
                return quickSelect(arr, part + 1, high, k);
            }

        }
        return Integer.MAX_VALUE;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, j, i);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
