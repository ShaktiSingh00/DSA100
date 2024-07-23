public class BinarToHexa {
    public static void main(String[] args) {
        String str = "11010";
        int res = binToDec(str);
        System.out.println("Decimal number is " + res);
        System.out.println(binToHexa(res));
    }

    public static int binToDec(String s) {
        int n = s.length();
        int sum = 0;
        int base = 1;
        for (int i = n - 1; i >= 0; i--) {
            int digit = s.charAt(i) - '0';
            sum += digit * base;
            base = base * 2;
        }

        return sum;
    }

    public static String binToHexa(int num) {

        char[] arr = { 'A', 'B', 'C', 'D', 'E', 'F' };
        // int base = 16;
        // StringBuilder sb = new StringBuilder();
        String res = " ";
        int remainder;
        // int hexNum = 0;
        while (num > 0) {
            remainder = num % 16;
            if (remainder >= 10) {
                res = arr[remainder - 10] + res;
            } else {
                res = remainder + res;
            }
            num = num / 16;
        }
        return res;

    }

}
