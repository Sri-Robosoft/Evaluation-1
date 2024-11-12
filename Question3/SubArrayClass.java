package Question3;

public class SubArrayClass {

    public static void findMaxSumOfSubArray(int[] arr) {
        int maximumSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int idx = 0;

        for (int i = 0; i <= arr.length - 4; i++) {
            currentSum = arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3];
            if (currentSum > maximumSum) {
                maximumSum = currentSum;
                idx = i;
            }
        }
        System.out.println("Sum of sub-array from index " + idx + " to " + (idx + 3) + " - " + maximumSum);
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 1, 9, 4, 12, 9, 7, 8, 12, 9, 4, 8, 8, 2, 3, 8};
        findMaxSumOfSubArray(arr);
    }
}