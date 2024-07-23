public class JumpGame0 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 1, 4 };
        int result = jumpGame(arr);
        System.out.println(result);
    }

    public static int jumpGame(int[] arr) {
        int n = arr.length;
        int curJump = 0;
        int maxJump = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            maxJump = Math.max(maxJump, i + arr[i]);
            if (i == curJump) {
                count++;
                curJump = maxJump;
                if (curJump >= n - 1) {
                    break;
                }
            }
        }
        return count;
    }
}
