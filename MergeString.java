public class MergeString {
    public static String mergeString(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < n && j < m) {
            if (i < n) {
                sb.append(str1.charAt(i));
            }
            if (j < m) {
                sb.append(str2.charAt(j));
            }
            i++;
            j++;
        }
        while (i < n) {
            sb.append(str1.charAt(i));
            i++;
        }
        while (j < m) {
            sb.append(str2.charAt(j));
            j++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "pqrstu";

        System.out.println(mergeString(str1, str2));
    }
}
