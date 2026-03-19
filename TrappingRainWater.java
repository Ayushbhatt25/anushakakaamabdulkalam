import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++)
            h[i] = sc.nextInt();
        int l = 0, r = n - 1, lMax = 0, rMax = 0, water = 0;
        while (l < r) {
            if (h[l] < h[r]) {
                if (h[l] >= lMax) lMax = h[l];
                else water += lMax - h[l];
                l++;
            } else {
                if (h[r] >= rMax) rMax = h[r];
                else water += rMax - h[r];
                r--;
            }
        }
        System.out.println(water);
        sc.close();
    }
}
