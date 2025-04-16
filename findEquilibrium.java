public class findEquilibrium{

    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        int index = findEquilibriumIndex(arr);
        if (index != -1) {
            System.out.println("Equilibrium index: " + index);
        } else {
            System.out.println("No equilibrium index found.");
        }
    }
}
