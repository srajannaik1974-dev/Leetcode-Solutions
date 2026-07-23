class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int l=1;
        int h=1;
        int lmin=1;
        int hmax=1;
        int max=nums[0];
        for(int i=0;i<n;i++){
            l=lmin*nums[i];
            h=hmax*nums[i];
            lmin=Math.min(l,Math.min(h,nums[i]));
            hmax=Math.max(l,Math.max(h,nums[i]));
            max=Math.max(hmax,max);
        }return max;
    }
}