public class JumpGame {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 0, 0, 4 };
        System.out.println(isJump(arr));
    }

    public static boolean isJump(int[] arr) {
        int n = arr.length;
        int finall = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (i + arr[i] >= finall) {
                finall = i;
            }
        }

        return finall == 0;
    }
}
