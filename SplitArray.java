public class SplitArray {

    public static boolean canBeSplit(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            leftSum += arr[i];
            int rightSum = totalSum - leftSum;
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        boolean result = canBeSplit(arr);
        if (result) {
            System.out.println("Array can be split into equal sum parts.");
        } else {
            System.out.println("Array cannot be split into equal sum parts.");
        }
    }
}
