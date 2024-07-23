import java.util.*;

public class MaxNumSumPair {
    public static int maxNumPair(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
        int count = 0;

        while (left < right) {
            if (arr[left] + arr[right] == k) {
                count++;
                left++;
                right--;
            } else if (arr[left] + arr[right] < k) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 3, 4, 3 };
        int k = 6;
        System.out.println(maxNumPair(arr, k));
    }
}
