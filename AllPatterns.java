public class AllPatterns {
    public static void main(String[] args) {
        int n = 4;
        // int maxI = 0;
        // for (int i = 1; i <= 2 * num; i++) {
        // maxI = (i > num) ? 2 * num - i : i;
        // for (int j = 1; j <= maxI; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= num; i++) {
        // for (int j = 0; j <= num - i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 0; k < i; k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = num; i >= 0; i--) {
        // for (int j = 1; j <= num - i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 0; k < i; k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        int leftNum = 1;
        int rightNum = n * n + 1;

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // Print numbers on the left side
            for (int j = 0; j < n - i; j++) {
                System.out.print(leftNum + " ");
                leftNum++;
            }

            // Print numbers on the right side
            for (int j = 0; j < n - i; j++) {
                System.out.print(rightNum + " ");
                rightNum++;
            }

            // Move to the next line
            System.out.println();
        }
    }
}
