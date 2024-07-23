public class JumpGameII {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 0, 1, 4 };
        System.out.println(jumpGame(arr));
    }

    public static int jumpGame(int[] arr) {
        int n = arr.length;
        if (n < 1) {
            return 0;
        }
        int jumps = 0;
        int curReach = 0;
        int farReach = 0;
        for (int i = 0; i < n; i++) {
            farReach = Math.max(farReach, i + arr[i]);
            if (i == curReach) {
                jumps++;
                curReach = farReach;
                if (curReach >= n - 1) {
                    break;
                }
            }
        }
        return jumps;
    }
}
