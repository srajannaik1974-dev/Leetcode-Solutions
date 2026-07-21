class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int j=0;
        int minlen=Integer.MAX_VALUE;
        int sum=0;
        
        
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            while(sum>=target){
               int len=i-j+1;
                minlen=Math.min(len,minlen);
                sum=sum-nums[j];
                j++;
            }
      }return minlen==Integer.MAX_VALUE ? 0 : minlen;
        
    }
}