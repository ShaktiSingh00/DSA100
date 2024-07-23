public class LongestSubArray {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        int k = 15;
        int result = lonSubSum(arr, k);
        System.out.println(result);
    }

    public static int lonSubSum(int[] arr, int k) {
        int sum = 0;
        int n = arr.length;
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

        }
    }
}
