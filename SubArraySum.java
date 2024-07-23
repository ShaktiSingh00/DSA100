import java.util.HashMap;

public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1 };
        int k = 2;
        int sum = subarraySum(arr, k);
        System.out.println(sum);
    }

    public static int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                count++;
            }
            if (hmap.containsKey(sum - k)) {
                count += hmap.get(sum - k);
            }
            hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
