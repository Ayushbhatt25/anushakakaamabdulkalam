import java.util.ArrayList;
import java.util.Scanner;

public class MajorityElementNBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int c1 = 0, c2 = 0, cnt1 = 0, cnt2 = 0;
        for (int x : arr) {
            if (x == c1) cnt1++;
            else if (x == c2) cnt2++;
            else if (cnt1 == 0) { c1 = x; cnt1 = 1; }
            else if (cnt2 == 0) { c2 = x; cnt2 = 1; }
            else { cnt1--; cnt2--; }
        }
        cnt1 = 0; cnt2 = 0;
        for (int x : arr) {
            if (x == c1) cnt1++;
            else if (x == c2) cnt2++;
        }
        ArrayList<Integer> res = new ArrayList<>();
        if (cnt1 > n / 3) res.add(c1);
        if (cnt2 > n / 3) res.add(c2);
        for (int x : res)
            System.out.print(x + " ");
        System.out.println();
        sc.close();
    }
}
