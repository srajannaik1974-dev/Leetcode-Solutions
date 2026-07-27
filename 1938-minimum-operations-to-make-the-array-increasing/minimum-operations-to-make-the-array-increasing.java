class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                continue;
            }else{
                int inc=nums[i-1]-nums[i]+1;
                count=count+inc;
                nums[i]=nums[i]+inc;
            }
        }return count;
    }
}