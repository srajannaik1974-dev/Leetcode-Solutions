class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int sum=0;
        int sum1=0;
        for(int i=0;i<n;i++){
            if(nums[i]<10){
                sum=sum+nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>9){
                 sum1=sum1+nums[i];
            }
        }return sum!=sum1;
    
    }
}