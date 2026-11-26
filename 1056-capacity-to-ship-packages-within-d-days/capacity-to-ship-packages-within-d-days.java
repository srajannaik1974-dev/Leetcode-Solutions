class Solution {
    public int shipWithinDays(int[] weights, int days) {
      int n=weights.length;
      int high=0;
      int low=Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
         low=Math.max(low,weights[i]);
         high+=weights[i];
      }
      int ans=0;
      while(low<=high){
        int count=1;
        int sum=0;
        int mid=(low+high)/2;
        for(int i=0;i<n;i++){
            if(sum+weights[i]<=mid){
                sum+=weights[i];
            }else{
                count++;
                sum=weights[i];
            }
        }
        if(count<=days){
            ans=mid;
            high=mid-1;
        }else{
            low=mid+1;
        }
      } return ans;
    }
}