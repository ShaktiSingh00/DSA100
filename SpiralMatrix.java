import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(spiralMatrix(mat));
    }

    public static List<Integer> spiralMatrix(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        List<Integer> list = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = n - 1;
        int endCol = m - 1;
        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                list.add(arr[startRow][j]);
            }
            for (int k = startRow + 1; k <= endRow; k++) {
                list.add(arr[k][endCol]);
            }
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                list.add(arr[endRow][j]);
            }
            for (int k = endRow - 1; k >= startRow + 1; k--) {
                if (endCol == startCol) {
                    break;
                }
                list.add(arr[k][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return list;

    }
}
