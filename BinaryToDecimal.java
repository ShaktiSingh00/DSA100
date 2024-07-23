public class BinaryToDecimal {
    public static void main(String[] args) {
        String s = "1101";
        int res = binaryToDec(s);
        System.out.println(res);
    }

    public static int binaryToDec(String str) {
        int n = str.length();
        int base = 1;
        int res = 0;
        for (int i = n - 1; i >= 0; i--) {
            int digit = str.charAt(i) - '0';
            res += digit * base;
            base = base * 8;
        }
        return res;
    }
}
