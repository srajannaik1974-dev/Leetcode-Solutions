class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int left=0;
        int sum=0;
        for(int num:nums){
              sum=sum+num;
        }
        for(int i=0;i<n;i++){
            int right=sum-nums[i]-left;
            if(left==right)return i;
            left=left+nums[i];
        }return -1;

    }
}