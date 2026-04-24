class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int zeros=0;
        int whites=0;
        int blue=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0)zeros++;
            else if(nums[i]==1)whites++;
            else  blue++;

        }
        for(int i=0;i<zeros;i++)
        nums[i]=0;
        for(int i=zeros;i<whites+zeros;i++)
        nums[i]=1;
        for(int i=whites+zeros;i<n;i++)
        nums[i]=2;
        
    }
}