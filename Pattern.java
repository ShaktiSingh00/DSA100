public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // *****
        // * *
        // * *
        // * *
        // *****

        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i);
        // }
        // System.out.println();
        // }

        // for (int i = n; i > 0; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // 1
        // 2 1 2
        // 3 2 1 2 3
        // 4 3 2 1 2 3 4
        // 5 4 3 2 1 2 3 4 5

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = i; j > 0; j--) {
        // System.out.print(j + " ");
        // }

        // for (int j = 2; j <= i; j++) {
        // System.out.print(j + " ");S
        // }

        // System.out.println();
        // }

        // ******
        // ******
        // ******
        // ******
        // ******

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int j = n; j >= i; j--) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        // for (int i = 1; i <= 2 * n - 1; i++) {
        // int row = i >= n ? 2 * n - i : i;
        // int col = n - row;
        // for (int j = 1; j <= col; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= row; j++) {
        // System.out.print(" *");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 2 * n; i++) {
        // int row = i >= n ? 2 * (n - i) : i;
        // int col = n - row;
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int j = row; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = i; j <= n; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= 2 * n - 1; i++) {
            int row = i >= n ? 2 * n - i : i;
            for (int j = 1; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
