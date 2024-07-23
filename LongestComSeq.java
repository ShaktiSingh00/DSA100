import java.util.*;

public class LongestComSeq {
    public static void main(String[] args) {
        int[] arr = { 100, 4, 200, 1, 3, 2 };
        int res = longestSeq(arr);
        System.out.println(res);
    }

    public static int longestSeq(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int small = Integer.MAX_VALUE;
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 <= small) {
                count++;
                small = arr[i];
            } else if (arr[i] - 1 != small) {
                count = 1;
                small = arr[i];
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
