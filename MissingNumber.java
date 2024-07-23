import java.util.HashSet;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 4, 5 };

        int result = missingNum(arr);
        System.out.println(result);
    }

    public static int missingNum(int[] arr) {
        int n = arr.length;
        HashSet<Integer> hset = new HashSet<>();
        int x = 0;
        for (int num : arr) {
            hset.add(num);
        }
        for (int i = 0; i <= n; i++) {
            if (!hset.contains(i)) {
                x = i;
            }

        }
        return x;
    }
}
