public class Swap2Num {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;

        // while (a > 0 && b > 0) {
        a = a + b;
        b = a - b;
        a = a - b;
        // }
        System.out.println(a);
        System.out.println(b);

    }
}
