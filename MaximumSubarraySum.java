import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int maxSum = arr[0], cur = arr[0];
        for (int i = 1; i < n; i++) {
            cur = Math.max(arr[i], cur + arr[i]);
            maxSum = Math.max(maxSum, cur);
        }
        System.out.println(maxSum);
        sc.close();
    }
}
