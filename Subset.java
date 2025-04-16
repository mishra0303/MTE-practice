import java.util.*;

public class Subset {

    public static List<List<Integer>> generateSubsets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        solve(0, arr, new ArrayList<>(), result);
        return result;
    }

    public static void solve(int index, int[] arr, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for (int i = index; i < arr.length; i++) {
            current.add(arr[i]);
            solve(i + 1, arr, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> subsets = generateSubsets(arr);
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
