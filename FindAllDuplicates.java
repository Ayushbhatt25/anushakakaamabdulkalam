import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FindAllDuplicates {
    static List<Integer> solve(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] < 0)
                res.add(idx + 1);
            else
                nums[idx] = -nums[idx];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        List<Integer> dups = solve(arr);
        for (int x : dups)
            System.out.print(x + " ");
        System.out.println();
        sc.close();
    }
}
