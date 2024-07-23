import java.util.Arrays;

public class MergeSorted {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 2, 5, 6 };

        System.out.println(Arrays.toString(mergeArr(arr1, arr2)));
    }

    public static int[] mergeArr(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int i = n - 1;
        int j = m - 1;
        int k = m + n - 1;
        int[] res = new int[m + n];
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                res[k--] = arr1[i--];
            } else {
                res[k--] = arr2[j--];
            }
        }

        while (i >= 0) {
            res[k--] = arr1[i--];
        }
        while (j >= 0) {
            res[k--] = arr2[j--];
        }
        return res;

    }
}
