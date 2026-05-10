class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        int max=0;
        int min=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            max=nums[n-1]*nums[n-2];
            min=nums[0]*nums[1];
        }return max-min;
    }
}