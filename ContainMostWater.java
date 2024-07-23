class ContainMostWater {
    public static int containMostWater(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (left < right) {
            min = Math.min(arr[left], arr[right]);
            int width = right - left;
            int cal = min * width;
            max = Math.max(max, cal);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1 };
        System.out.println(containMostWater(arr));
    }
}

