import java.util.*;
public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result[]=new int[2];
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{arr[left], arr[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{result[0],result[1]};
       
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10};
        int target = 8;
       System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
