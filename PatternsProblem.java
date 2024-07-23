import java.util.Scanner;

public class PatternsProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array N
        int N = scanner.nextInt();

        // Read the array elements
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        // Determine the maximum number of rows needed
        int max = 0;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        // Print the asterisks column by column
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < N; j++) {
                if (array[j] >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
