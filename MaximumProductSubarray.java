import java.util.Scanner;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int maxProd = nums[0], curMax = nums[0], curMin = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                int t = curMax;
                curMax = curMin;
                curMin = t;
            }
            curMax = Math.max(nums[i], curMax * nums[i]);
            curMin = Math.min(nums[i], curMin * nums[i]);
            maxProd = Math.max(maxProd, curMax);
        }
        System.out.println(maxProd);
        sc.close();
    }
}
