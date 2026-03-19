import java.util.Scanner;
public class TrappingRainWater {
    static int solve(int[] h) {
        int l = 0, r = h.length - 1;
        int lmax = 0, rmax = 0, water = 0;
        while (l < r) {
            if (h[l] < h[r]) {
                if (h[l] >= lmax) lmax = h[l];
                else water += lmax - h[l];
                l++;
            } else {
                if (h[r] >= rmax) rmax = h[r];
                else water += rmax - h[r];
                r--;
            }
        }
        return water;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++)
            h[i] = sc.nextInt();
        System.out.println(solve(h));
        sc.close();
    }
}
