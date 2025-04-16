import java.util.*;

public class KthSmallest {

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                list.add(matrix[i][j]);
            }
        }

        Collections.sort(list);
        return list.get(k - 1);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;
        int result = kthSmallest(matrix, k);
        System.out.println("The " + k + "th smallest element is: " + result);
    }
}
