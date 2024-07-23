public class LongIncSub {
    public static void main(String[] args) {
        int[] num = { 0, 1, 0, 3, 2, 3 };
        int result = maxLenSub(num);
        System.out.println(result);
    }

    public static int maxLenSub(int[] num) {
        int n = num.length;
        int[] dp = new int[n];
        int maxlen = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (num[i] > num[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                    }
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > maxlen) {
                maxlen = dp[i];
            }
        }
        return maxlen + 1;
    }
}
