import java.util.Arrays;

public class LongComPre {
    public static String longComPre(String[] str) {
        int n = str.length;
        Arrays.sort(str);
        String left = str[0];
        String right = str[n - 1];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                return sb.toString();
            }
            sb.append(left.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] str = { "hello", "world" };
        System.out.println(longComPre(str));
    }
}
