import java.util.ArrayList;
import java.util.Scanner;

public class FindAllDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] < 0)
                res.add(idx + 1);
            else
                nums[idx] = -nums[idx];
        }
        for (int x : res)
            System.out.print(x + " ");
        System.out.println();
        sc.close();
    }
}
