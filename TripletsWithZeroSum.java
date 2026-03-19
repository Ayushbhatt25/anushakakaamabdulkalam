import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TripletsWithZeroSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        ArrayList<int[]> res = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if (sum == 0) {
                    res.add(new int[]{arr[i], arr[l], arr[r]});
                    while (l < r && arr[l] == arr[l + 1]) l++;
                    while (l < r && arr[r] == arr[r - 1]) r--;
                    l++; r--;
                } else if (sum < 0) l++;
                else r--;
            }
        }
        for (int[] t : res)
            System.out.println(t[0] + " " + t[1] + " " + t[2]);
        sc.close();
    }
}
