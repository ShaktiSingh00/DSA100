import java.util.*;

public class InterQuestion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        // Read input until a non-integer is encountered
        while (scan.hasNextInt()) {
            arr.add(scan.nextInt());
        }
        scan.close();

        List<Integer> ans = prevnextMul(arr);

        // Print the result list
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> prevnextMul(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();

        // Handle edge case for empty or single-element list
        if (arr.size() == 0)
            return result;
        if (arr.size() == 1) {
            result.add(0);
            return result;
        }

        // First element
        result.add(arr.get(0) * arr.get(1));

        // Middle elements
        for (int i = 1; i < arr.size() - 1; i++) {
            result.add(arr.get(i - 1) * arr.get(i + 1));
        }

        // Last element
        result.add(arr.get(arr.size() - 1) * arr.get(arr.size() - 2));

        return result;
    }
}
