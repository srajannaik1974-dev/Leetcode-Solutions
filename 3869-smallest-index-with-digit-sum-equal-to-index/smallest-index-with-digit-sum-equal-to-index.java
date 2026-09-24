class Solution {
    public int smallestIndex(int[] nums) {
      int n=nums.length;
      int sum=0;
      for(int i=0;i<n;i++){
        while(nums[i]!=0){
            int rem=nums[i]%10;
             sum=sum+rem;
             nums[i]/=10;
        }if(sum==i){
            return i;
        }
        sum=0;


      }  return -1;
    }
}