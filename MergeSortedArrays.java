import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {
    static void merge(int[] a, int[] b) {
        int n = a.length, m = b.length;
        int gap = (n + m + 1) / 2;
        while (gap > 0) {
            int i = 0, j = gap;
            while (j < n + m) {
                int val1, val2;
                if (i < n) val1 = a[i]; else val1 = b[i - n];
                if (j < n) val2 = a[j]; else val2 = b[j - n];
                if (val1 > val2) {
                    if (i < n) a[i] = val2; else b[i - n] = val2;
                    if (j < n) a[j] = val1; else b[j - n] = val1;
                }
                i++;
                j++;
            }
            if (gap == 1) break;
            gap = (gap + 1) / 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();
        merge(a, b);
        for (int i = 0; i < n; i++) System.out.print(a[i] + " ");
        for (int i = 0; i < m; i++) System.out.print(b[i] + " ");
        System.out.println();
        sc.close();
    }
}
