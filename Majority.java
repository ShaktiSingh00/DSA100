import java.util.HashMap;
import java.util.Map;

public class Majority {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        int n = arr.length;
        int result = majEle(arr);
        System.out.println(result);
    }

    public static int majEle(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int num : arr) {
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() > 3) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
