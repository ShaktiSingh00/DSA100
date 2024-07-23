import java.util.*;

public class MaxAveSub {
    public static double maxAvSub(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        double avg = 0;
        int j = 0, i = 0;
        double max = Integer.MIN_VALUE;

        while (j < n) {
            sum = sum + arr[j];
            avg = (double) sum / k;

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                max = Math.max(max, avg);
                sum -= arr[j];

                i++;
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 12, -5, -6, 50, 3 };
        System.out.println(maxAvSub(arr, 4));
    }
}
