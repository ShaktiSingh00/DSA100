import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        int k = 2;

        rotateLeft(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        int[] res = new int[n];
        int step = k % n;

    }
}
