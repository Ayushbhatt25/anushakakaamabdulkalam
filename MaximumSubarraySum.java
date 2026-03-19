import java.util.Scanner;
public class MaximumSubarraySum {
    static int kadane(int[] arr) {
        int maxSum = arr[0], cur = arr[0];
        for (int i = 1; i < arr.length; i++) {
            cur = Math.max(arr[i], cur + arr[i]);
            maxSum = Math.max(maxSum, cur);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(kadane(arr));
        sc.close();
    }
}
