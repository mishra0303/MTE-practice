import java.util.*;

public class RangePrefix {
    
    public static int[] buildPrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    public static int getRangeSum(int[] prefix, int L, int R) {
        if (L == 0) {
            return prefix[R];
        } else {
            return prefix[R] - prefix[L - 1];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 10, 3};
        int[] prefix = buildPrefixSum(arr);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter L and R (0-based indices): ");
        int L = sc.nextInt();
        int R = sc.nextInt();

        int sum = getRangeSum(prefix, L, R);
        System.out.println("Sum from index " + L + " to " + R + " is: " + sum);
    }
}
