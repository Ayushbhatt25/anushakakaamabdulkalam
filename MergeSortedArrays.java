import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n], b = new int[m];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();
        int gap = (n + m + 1) / 2;
        while (gap > 0) {
            int i = 0, j = gap;
            while (j < n + m) {
                int v1 = i < n ? a[i] : b[i - n];
                int v2 = j < n ? a[j] : b[j - n];
                if (v1 > v2) {
                    if (i < n) a[i] = v2; else b[i - n] = v2;
                    if (j < n) a[j] = v1; else b[j - n] = v1;
                }
                i++; j++;
            }
            if (gap == 1) break;
            gap = (gap + 1) / 2;
        }
        for (int i = 0; i < n; i++) System.out.print(a[i] + " ");
        for (int i = 0; i < m; i++) System.out.print(b[i] + " ");
        System.out.println();
        sc.close();
    }
}
