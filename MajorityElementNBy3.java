import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MajorityElementNBy3 {
    static List<Integer> majorityElement(int[] nums) {
        int c1 = 0, c2 = 0, cnt1 = 0, cnt2 = 0;
        for (int num : nums) {
            if (num == c1) cnt1++;
            else if (num == c2) cnt2++;
            else if (cnt1 == 0) { c1 = num; cnt1 = 1; }
            else if (cnt2 == 0) { c2 = num; cnt2 = 1; }
            else { cnt1--; cnt2--; }
        }
        cnt1 = 0; cnt2 = 0;
        for (int num : nums) {
            if (num == c1) cnt1++;
            else if (num == c2) cnt2++;
        }
        List<Integer> res = new ArrayList<>();
        if (cnt1 > nums.length / 3) res.add(c1);
        if (cnt2 > nums.length / 3) res.add(c2);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        List<Integer> ans = majorityElement(arr);
        for (int x : ans)
            System.out.print(x + " ");
        System.out.println();
        sc.close();
    }
}
