class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int [] arr=new int[2];
        int i=0,j=n-1;
        while(i<=j){
            if(nums[i]+nums[j]==target){
            arr[0]=i+1;
            arr[1]=j+1;
            return arr;
            }
            else if(nums[i]+nums[j]>target){
                j--;
            }else{
                i++;
            }
        }return arr;
    }
}