class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int i=0;
        int prod=1;
        if(n<=1) return 0;
        for(int j=0;j<n;j++){
            prod=prod*nums[j];


            while(prod>=k){
                prod=prod/nums[i];
                i++;
            }
            count=count+j-i+1;
        }return count;

    }
}