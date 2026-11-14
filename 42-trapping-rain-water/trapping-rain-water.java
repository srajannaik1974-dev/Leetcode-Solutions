class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int max=0;
        int leftmax=0;
        int rightmax=0;
        int left=0;
        int right=n-1;
        while(left<right){
            if(height[left]<height[right]){
                
            leftmax=Math.max(leftmax,height[left]);
            max+=leftmax-height[left];
            left++;
        }else{
            rightmax=Math.max(rightmax,height[right]);
            max+=rightmax-height[right];
            right--;
        }
        }return max;
    }
}