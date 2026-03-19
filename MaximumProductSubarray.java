import java.util.Scanner;
public class MaximumProductSubarray {
    static int maxProduct(int[] nums) {
        int maxProd = nums[0], curMax = nums[0], curMin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int t = curMax;
                curMax = curMin;
                curMin = t;
            }
            curMax = Math.max(nums[i], curMax * nums[i]);
            curMin = Math.min(nums[i], curMin * nums[i]);
            maxProd = Math.max(maxProd, curMax);
        }
        return maxProd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(maxProduct(arr));
        sc.close();
    }
}
