class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int ans=0;
        int low=1;
        int sum=0;
        int high=0;
        for(int num:nums){
             high=Math.max(high,num);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            sum=0;
            for(int i=0;i<n;i++){
                int var=(int)Math.ceil((double)nums[i]/mid);
                sum=sum+var;
            }
            if(sum<=threshold){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return ans;

    }
}