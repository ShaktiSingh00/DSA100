public class BestTimeToBuyStock {
    public static void main(String[] args) {
        int[] arr = { 7, 6, 4, 3, 1 };

        int result = maxProfit(arr);
        System.out.println(result);
    }

    public static int maxProfit(int[] arr) {
        int n = arr.length;
        int min = arr[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
            int profit = arr[i] - min;
            max = Math.max(max, profit);
        }

        return max;
    }
}
