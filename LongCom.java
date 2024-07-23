public class LongCom {
    public static void main(String[] args) {
        String[] str = { "flower", "flow", "flight" };
        String res = longCom(str);

        System.out.println(res);
    }

    public static String longCom(String[] str) {
        int n = str.length;
        String strs = str[0];
        for (int i = 1; i < n; i++) {
            strs = helperFun(strs, str[i]);
        }

        return strs;
    }

    public static String helperFun(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int x = Math.min(n, m);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                sb.append(str1.charAt(i));
            } else {
                break;
            }
        }

        return sb.toString();
    }
}
