import java.util.Scanner;

public class SortZeroesOnesTwos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int lo = 0, mid = 0, hi = n - 1;
        while (mid <= hi) {
            if (arr[mid] == 0) {
                int t = arr[lo]; arr[lo] = arr[mid]; arr[mid] = t;
                lo++; mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int t = arr[mid]; arr[mid] = arr[hi]; arr[hi] = t;
                hi--;
            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
}
