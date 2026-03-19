import java.util.Scanner;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                j++;
            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
}
