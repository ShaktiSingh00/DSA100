public class PracticeArr {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 9, 1, 3, 6 };
        int k = 3;
        int result = kthSmallest(arr, k);
        System.out.println(result);
    }

    public static int kthSmallest(int[] arr, int k) {
        int n = arr.length;
        return quickSelect(arr, 0, n - 1, k - 1);
    }

    public static int quickSelect(int[] arr, int start, int end, int k) {
        while (start <= end) {
            int pIndex = partitionArr(arr, start, end);
            if (pIndex == k) {
                return arr[pIndex];
            } else if (pIndex < k) {
                return quickSelect(arr, pIndex + 1, end, k);
            } else {
                return quickSelect(arr, start, pIndex - 1, k);
            }

        }
        return -1;
    }

    public static int partitionArr(int[] arr, int start, int end) {
        int pivot = arr[end];
        int j = start - 1;
        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                j++;
                swapArr(arr, i, j);
            }
        }
        swapArr(arr, j + 1, end);
        return j + 1;
    }

    public static void swapArr(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
