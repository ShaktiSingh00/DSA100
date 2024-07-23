public class MaxCons1 {
    public static int maxOnes(int[] arr, int k) {
        int n = arr.length;
        int i = 0, j = 0;
        int count0 = 0;
        int count1 = 0;
        int max = Integer.MIN_VALUE;

        while (j < n) {
            if (arr[j] == 0) {
                count0++;
            }
            if (count0 > k) {
                if (arr[i] == 0) {
                    count0--;
                }
                i++;
            }

            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1 };
        int k = 2;
        int result = maxOnes(arr, k);
        System.out.println(result);
    }

}
