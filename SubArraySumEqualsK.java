import java.util.*;

public class SubArraySumEqualsK {

    public static int countSubarrays(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, count = 0;
        map.put(0, 1);

        for (int num : arr) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int k = 2;
        int result = countSubarrays(arr, k);
        System.out.println(result);
    }
}
