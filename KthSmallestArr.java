public class KthSmallestArr {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 8, 9, 1, 3, 7 };
        int k = 5;
        int result = kthSmallest(arr, k);
        System.out.println(result);
    }

    public static int kthSmallest(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, k - 1);
    }

    public static int quickSelect(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int part = partitionArr(arr, low, high);

            if (part == k) {
                return arr[part];
            } else if (part < k) {
                return quickSelect(arr, part + 1, high, k);
            } else {
                return quickSelect(arr, low, part - 1, k);
            }
        }

        return -1;
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
