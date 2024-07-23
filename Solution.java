class Solution {
    public void printStarsVertically(int[] arr) {
        // Find the maximum value in the array to determine the number of rows
        int max = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Print stars vertically for each column
        for (int row = 0; row < max; row++) {
            for (int num : arr) {
                if (row < num) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = { 2, 0, 4, 5 };
        sol.printStarsVertically(arr);
    }
}
