class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;

        int low=1;
        int high=0;
        for(int i=0;i<n;i++){
            high=Math.max(high,nums[i]);
        }
        int count=0;
        int ans=0;
        while(low<=high){
            count=0;
            int mid=(low+high)/2;
            for(int i=0;i<n;i++){
            count+=(nums[i]+mid-1)/mid;
            }
            if(count<=threshold){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return ans;
    }
}