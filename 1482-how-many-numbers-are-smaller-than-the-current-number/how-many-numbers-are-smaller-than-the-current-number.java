class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            int j=0;
            int count=0;
            while(j<n){
                if(nums[i]!=nums[j] && nums[i]>nums[j]){
                       count++;
                }
                j++;
            }
            arr[i]=count;

        }return arr;
    }
}