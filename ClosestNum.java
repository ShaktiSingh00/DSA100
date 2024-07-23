public class ClosestNum {
    public static void main(String[] args) {
        int[] arr = { 8, 4, 1, 3, 6 };
        int k = 5;

        int result = closestNum(arr, k);
        System.out.println(result);
    }

    public static int closestNum(int[] arr, int k) {
        int n = arr.length;

        int firstNum = arr[0];
        int firstDif = Math.abs(arr[0] - k);

        for (int i = 1; i < n; i++) {
            int curDif = Math.abs(arr[i] - k);
            if (curDif < firstDif || (curDif == firstDif && arr[i] > firstNum)) {
                firstNum = arr[i];
                firstDif = curDif;
            }
        }
        return firstNum;
    }
}
