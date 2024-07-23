public class GCDNum {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int result = gcdNum(a, b);
        int lcm = (a * b) / result;
        System.out.println(result);
        System.out.println(lcm);
    }

    public static int gcdNum(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
