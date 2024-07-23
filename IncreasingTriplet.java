public class IncreasingTriplet {
    public static boolean increaseTriplet(int[] arr) {
        int n = arr.length;
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= max1) {
                max1 = arr[i];
            } else if (arr[i] <= max2) {
                max2 = arr[i];
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println(increaseTriplet(arr));
    }

}
