import java.util.Arrays;

class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int n = arr.length;
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] arr, int k) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int[] res = new int[2];
        while (low < high) {
            int sum = arr[low] + arr[high];
            if (sum == k) {
                res[0] = low;
                res[1] = high;
                return res;
            } else if (sum < k) {
                low++;
            } else {
                high--;
            }
        }
        return new int[0];
    }
}