class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minbuy=prices[0];
        int maxprofit=0;
        int profit=0;
        for(int i=0;i<n;i++){
             profit=prices[i]-minbuy;
             maxprofit=Math.max(maxprofit,profit);
            if(prices[i]<minbuy)
            minbuy=prices[i];
           
        }return maxprofit;
    }
}