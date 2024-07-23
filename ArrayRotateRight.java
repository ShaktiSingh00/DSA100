import java.util.Arrays;

class ArrayRotateJava {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotateArray(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        int[] res = new int[n];
        int step = k % n;
        for (int i = 0; i < step; i++) {
            res[i] = arr[n - step + i];
        }
        // for(int i=step;i<n;i++){
        // arr[i-step] = arr[i];
        // }
        for (int i = n - step - 1; i >= 0; i--) {
            arr[i + step] = arr[i];
        }
        for (int i = 0; i < step; i++) {
            arr[i] = res[i];
        }
    }
}