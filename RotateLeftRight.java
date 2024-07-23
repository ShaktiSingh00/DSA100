public class RotateLeftRight {
    public static String leftRotate(String str, int k) {
        int step = k % str.length();
        return str.substring(step) + str.substring(0, step);

    }

    public static String rightRotate(String str, int k) {
        int n = str.length();
        int step = k % str.length();
        return str.substring(n - step) + str.substring(0, n - step);

    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(leftRotate(str, 2));
        System.out.println(rightRotate(str, 2));
    }
}
