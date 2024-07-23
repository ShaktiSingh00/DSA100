public class ReverseWord {
    public static String reverseWord(String str) {
        int n = str.length();
        String[] res = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = res.length - 1; i >= 0; i--) {
            sb.append(res[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = " I am good";
        System.out.println(reverseWord(str));
    }
}
