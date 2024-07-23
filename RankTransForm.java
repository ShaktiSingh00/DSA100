import java.util.Arrays;
import java.util.HashMap;

public class RankTransForm {
    public static void main(String[] args) {
        int[] arr = { 10, 40, 20, 30, 5 };

        System.out.println(Arrays.toString(rankOfArr(arr)));
    }

    public static int[] rankOfArr(int[] arr) {
        int n = arr.length;
        int rank = 1;
        int[] result = new int[n];
        int[] res = Arrays.copyOf(arr, n);

        Arrays.sort(res);

        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!hmap.containsKey(res[i])) {
                hmap.put(res[i], rank++);
            }
        }
        for (int i = 0; i < n; i++) {
            result[i] = hmap.get(arr[i]);
        }
        return result;
    }
}
