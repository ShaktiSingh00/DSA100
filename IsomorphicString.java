import java.util.HashMap;

public class IsomorphicString {

    public static boolean isomorphicStr(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> hmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hmap.containsKey(s.charAt(i))) {
                continue;
            } else {
                hmap.put(s.charAt(i), t.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(hmap.get(s.charAt(i)));
        }
        return sb.toString().equals(t);
    }

    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.println(isomorphicStr(s, t));
    }
}
