import java.util.*;

public class GeneratePermutation {

    public static List<List<Integer>> generatePermutations(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        permute(arr, 0, result);
        return result;
    }

    public static void permute(int[] arr, int index, List<List<Integer>> result) {
        if (index == arr.length) {
            List<Integer> ans = new ArrayList<>();
            for (int num : arr) {
                ans.add(num);
            }
            result.add(ans);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, i, index);
            permute(arr, index + 1, result);
            swap(arr, i, index);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = generatePermutations(arr);
        for (List<Integer> p : ans) {
            System.out.println(p);
        }
    }
}
