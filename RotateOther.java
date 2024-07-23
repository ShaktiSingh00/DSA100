import java.util.Arrays;

public class RotateOther {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2;
        System.out.println(Arrays.toString(rotateArr(arr, k)));
    }

    public static int[] rotateArr(int[] arr, int k){
        int n = arr.length;
        int step = k%n;
        int[] res = new int[step];

        for(int i=n-step+1;i<n;i++){
            res[i] = arr[i];
        }
        for(int i)

    }
    // public static int[] rotateArr(int[] arr, int k) {
    //     int n = arr.length;
    //     int step = k % n;
    //     int[] res = new int[n];
    //     for (int i = 0; i < step; i++) {
    //         res[i] = arr[i];
    //     }
    //     for (int i = step; i < n; i++) {
    //         arr[i - step] = arr[i];
    //     }
    //     for (int i = 0; i < step; i++) {
    //         arr[n - step + i] = res[i];
    //     }

    //     return arr;
    // }

    // public static void rotateArr(int[] arr, int k) {
    // int n = arr.length;
    // k = k % n;

    // reverseArr(arr, 0, k - 1);
    // reverseArr(arr, k, n - 1);
    // reverseArr(arr, 0, n - 1);
    // }

    // public static void reverseArr(int[] arr, int low, int high) {
    // while (low < high) {
    // int temp = arr[low];
    // arr[low] = arr[high];
    // arr[high] = temp;

    // low++;
    // high--;
    // }
    // }
}
