class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        long ans=0;
        long low=1;
        long high=0;
        for(int i=0;i<n;i++){
             high=Math.max(high,piles[i]);
        }
        
        while(low<=high){
            long count=0;
            long mid=(low+high)/2;
            for(int i=0;i<n;i++){
                 count+=(long)((piles[i]+mid-1)/mid);
            }
            if(count<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return (int)ans;
    }
}