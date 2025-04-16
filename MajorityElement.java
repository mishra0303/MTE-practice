public class MajorityElement {

    public static int findMajority(int[] arr) {
        int count = 0;
        int result = 0;

        for (int num : arr) {
            if (count == 0) {
                result = num;
            }

            if (num == result) {
                count++;
            } else {
                count--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 2, 2};
        int majority = findMajority(arr);
        System.out.println("Majority element is: " + majority);
    }
}
