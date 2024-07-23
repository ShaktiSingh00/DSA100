import java.util.HashSet;

public class LongestSub {
    public static int countSubString(String str) {
        int n = str.length();
        HashSet<Character> hset = new HashSet<>();
        int max = 0;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (!hset.contains(str.charAt(right))) {
                hset.add(str.charAt(right));
                max = Math.max(max, right - left + 1);
            } else {
                if (str.charAt(left) != str.charAt(right)) {
                    hset.remove(left);
                    left++;
                }
                hset.remove(right);
                left++;
                hset.add(str.charAt(right));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        int n = str.length();
        int res = countSubString(str);
        System.out.println(res);
    }
}
