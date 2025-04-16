import java.util.*;

public class TwoSumHashing {

    public static int[] findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int requiredNumber = target - arr[i];
            if (map.containsKey(requiredNumber)) {
                return new int[] {requiredNumber, arr[i]};
            }
            map.put(arr[i], i);
        }

        return new int[] {-1, -1}; // if no pair found
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(arr, target);
        System.out.println("Two numbers: " + result[0] + ", " + result[1]);
    }
}
