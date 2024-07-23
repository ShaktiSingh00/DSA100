import java.util.*;

public class PermutationArr {
    public static List<List<Integer>> permuteArr(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();

        findPermute(0, arr, list);
        return list;
    }

    public static void findPermute(int index, int[] arr, List<List<Integer>> res) {
        if (index == arr.length) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                result.add(arr[i]);
            }

            res.add(new ArrayList<>(result));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(i, index, arr);
            findPermute(index + 1, arr, res);
            swap(i, index, arr);
        }
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> final1 = permuteArr(arr);

        for (List num : final1) {
            System.out.println(num);
            ;
        }
    }
}
