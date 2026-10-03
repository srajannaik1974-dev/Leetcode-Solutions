class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int low=0;
        int high=0;
        if((long)m*k>n){
            return -1;
        }
        int ans=0;
        for(int day:bloomDay){
            low=Math.min(low,day);
            high=Math.max(high,day);

        }
        while(low<=high){
            int bouquet=0;
            int flower=0;
            int mid=(low+high)/2;
            for(int day:bloomDay){
                if(day<=mid){
                    flower++;
                
                if(flower==k){
                    bouquet++;
                    flower=0;
                }
                
            }else{
                flower=0;
            }
        }
        if(bouquet>=m){
            ans=mid;
            high=mid-1;
        }else{
            low=mid+1;
        }
        }return ans;
        
    }
}