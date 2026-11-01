class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            int sum=prices[i]-buy;
            profit=Math.max(profit,sum);
        }return profit;

    }
}