import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = { 9 };
        int n = arr.length;
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 9) {
                arr[i]++;
                break;
            } else {
                arr[i] = 0;
            }
        }
        if (arr[0] == 0) {
            int[] arr1 = new int[n + 1];
            arr1[0] = 1;
            return arr1;
        }
        return arr;
    }
}
