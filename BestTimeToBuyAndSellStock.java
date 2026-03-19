import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++)
            prices[i] = sc.nextInt();
        int minPrice = prices[0], profit = 0;
        for (int i = 1; i < n; i++) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
            else
                profit = Math.max(profit, prices[i] - minPrice);
        }
        System.out.println(profit);
        sc.close();
    }
}
