import java.util.Arrays;

public class ProductOfArray {
    public static int[] selfProduct(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * arr[i - 1];
        }
        int pro = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * pro;
            pro = pro * arr[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(selfProduct(arr)));
    }

}
