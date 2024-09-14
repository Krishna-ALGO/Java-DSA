import java.util.Scanner;
public class BuyAndSellStocks {

    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            minPrice = Math.min(minPrice, price);
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of Days: : ");
        int n = scn.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the stocks prices for each day : ");
        for(int i = 0 ; i < n ; i++){
            prices[i] = scn.nextInt();
        }
        int profit = maxProfit(prices);
        System.out.println("The max Profit is : " + profit);
    }
}
