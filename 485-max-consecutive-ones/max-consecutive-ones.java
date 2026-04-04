class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0;
        int max1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
                max1=Math.max(count,max1);

            }else{
                count=0;
            }
        }return max1;
    }
}