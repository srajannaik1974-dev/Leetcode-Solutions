class Solution {
    public int maxProfit(int[] nums) {
       int n=nums.length;
       int buy=nums[0];
       int max=0;
       for(int i=1;i<n;i++){
          if(nums[i]<buy){
            buy=nums[i];
          }
          int profit=nums[i]-buy;
          max=Math.max(profit,max);
       } return max;
    }
}