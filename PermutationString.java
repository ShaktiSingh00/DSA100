// import java.util.*;

// public class PermutationString {

//     public static List<String> permutString(String str){
//         List<String> permutations = new ArrayList<>();
//         Set<String> uniquePermutations = new HashSet<>();
//         char[] chars = str.toCharArray();
//         recurPermute(0, chars, uniquePermutations);
//         permutations.addAll(uniquePermutations);
//         Collections.sort(permutations); // Sort the permutations lexicographically
//         return permutations;
//     }

//     public static void recurPermute(int index, char[] chars, Set<String> res) {
//         if (index == chars.length) {
//             res.add(new String(chars));
//             return;
//         }
//         for (int i = index; i < chars.length; i++) {
//             swap(i, index, chars);
//             recurPermute(index + 1, chars, res);
//             swap(i, index, chars); // backtrack
//         }
//     }

//     public static void swap(int i, int j, char[] chars) {
//         char temp = chars[i];
//         chars[i] = chars[j];
//         chars[j] = temp;
//     }
//     public static void main(String[] args) {
//         String input = "ABC";
//         ArrayList<String> permutations = permutString(input);

//         // Sorting the permutations in lexicographical order
//         Collections.sort(permutations);

//         // Printing the permutations
//         for (String perm : permutations) {
//             System.out.println(perm);
//         }
//     }
// }

import java.util.*;

public class PermutationString {

    public static List<String> permutString(String str) {
        List<String> permutations = new ArrayList<>();
        Set<String> uniquePermutations = new HashSet<>();
        char[] chars = str.toCharArray();
        recurPermute(0, chars, uniquePermutations);
        permutations.addAll(uniquePermutations);
        Collections.sort(permutations); // Sort the permutations lexicographically
        return permutations;
    }

    public static void recurPermute(int index, char[] chars, Set<String> res) {
        if (index == chars.length) {
            res.add(new String(chars));
            return;
        }
        for (int i = index; i < chars.length; i++) {
            swap(i, index, chars);
            recurPermute(index + 1, chars, res);
            swap(i, index, chars); // backtrack
        }
    }

    public static void swap(int i, int j, char[] chars) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String input = "ABC";
        List<String> permutations = permutString(input);

        // Printing the permutations
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
}
