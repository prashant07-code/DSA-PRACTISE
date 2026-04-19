public class buy_sell_stock {
    public static int buys_sellstock(int prices[]){
   int buyprices= Integer.MAX_VALUE;
   int maxprofit = 0;
   int n = prices.length;
   for (int i = 0; i<n; i++){
    if(buyprices<prices[i]){ // profit
         int profit = prices[i]- buyprices;
         // today profit
         maxprofit = Math.max(maxprofit, profit);
         
    }
    buyprices= prices[i];
   }
    return maxprofit;
    }
    public static void main(String[] args) {
        int prices [] = {7,1,5,3,6,4};
        System.out.println(buys_sellstock(prices));
    }
}
