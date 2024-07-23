import java.util.*;

public class RepeatingElements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -1, 1, 3, 1 };
        System.out.println(Arrays.toString(repeatingArr(arr)));
    }

    public static int[] repeatingArr(int[] arr) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());

            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
