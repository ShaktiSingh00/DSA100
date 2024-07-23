import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String str1 = "anagramap";
        String str2 = "nagaramtu";

        System.out.println(isAnagram(str1, str2));
    }

    public static boolean isAnagram(String str1, String str2) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (char c : str1.toCharArray()) {
            hmap.put(c, hmap.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            if (hmap.containsKey(c)) {
                if (hmap.get(c) == 1) {
                    hmap.remove(c);
                } else {
                    hmap.put(c, hmap.get(c) - 1);
                }
            } else {
                return false;
            }
        }

        return hmap.isEmpty();
    }
}
