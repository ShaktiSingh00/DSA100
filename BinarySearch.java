public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 9, 10 };
        int target = 15;
        int res = binarSearch(arr, target);
        System.out.println(res);
    }

    public static int binarSearch(int[] arr, int k) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                // left = mid + 1;
                return binarSearch(arr, mid + 1);
            } else {
                // right = mid - 1;
                return binarSearch(arr, mid - 1);
            }
        }
        return -1;
    }
}
