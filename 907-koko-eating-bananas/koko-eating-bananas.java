class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long low=1;
        long high=0;
        for(int pile:piles){
             high=Math.max(pile,high);
        }
        long ans=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            long hours=0;
            for(long pile:piles){
                hours+=(pile+mid-1)/mid;
            }
            if(hours<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return (int)ans;
    }
}