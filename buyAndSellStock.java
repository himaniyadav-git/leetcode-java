package arraysInJava;

public class buyAndSellStock {
    //maximize profit by choosing a single day to buy stock and in future choosing a day to sell stock
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println( "max profit :" + buy_sellStocks(prices));
    }
    public static int buy_sellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;//+infinity
        int maxProfit = 0;

        //minimum buy price
        for(int i = 0; i < prices.length; i++){
            if(buyPrice < prices[i]){//5,3,6,4
                int profit =  prices[i] - buyPrice;//4,2,5,3
                // System.out.println("profit at day "+i+ " is : "+ profit);
                maxProfit = Math.max(maxProfit,profit);//5
            }
            else{
                buyPrice = prices[i];//7,1
            }
        }
        
        return maxProfit;
    }
}
