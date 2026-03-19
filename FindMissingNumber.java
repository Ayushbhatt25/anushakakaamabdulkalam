import java.util.Scanner;
public class FindMissingNumber {
    static int findMissing(int[] arr, int n) {
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return total - sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++)
            arr[i] = sc.nextInt();
        System.out.println(findMissing(arr, n));
        sc.close();
    }
}
