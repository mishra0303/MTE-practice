import java.util.*;

public class MaxFrequency {

    public static int findMaxFrequencyElement(int[] arr) {
        Map<Integer, Integer>mp = new HashMap<>();
        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int maxElement = arr[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3, 5};
        int result = findMaxFrequencyElement(arr);
        System.out.println("Element with maximum frequency: " + result);
    }
}
