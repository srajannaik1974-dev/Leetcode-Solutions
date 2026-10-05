class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int n=weights.length;
    int low=0;
    int high=0;
    for(int i=0;i<n;i++){
        low=Math.max(weights[i],low);
        high=high+weights[i];
    }

    int ans=0;
       while(low<=high){
        int mid=low+(high-low)/2;
        int sum=0;
        int day=1;
        
        for(int i=0;i<n;i++){
            sum=sum+weights[i];
            if(sum>mid){
                day++;
                sum=weights[i];
            }
        }
            if(day>days){
                low=mid+1;
            }else{
                ans=mid;
                high=mid-1;
            }
        
       }return ans;
    }
}