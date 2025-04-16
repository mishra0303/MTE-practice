public class MaximumSubArray {

    public static int maxSubarraySum(int[] arr, int k) {
        if (arr.length < k) return -1;
        int Sum = 0;
        for (int i = 0; i < k; i++) {
            Sum += arr[i];
        }
        int maxSum = Sum;
        for (int i = k; i < arr.length; i++) {
            Sum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, Sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int result = maxSubarraySum(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
}
