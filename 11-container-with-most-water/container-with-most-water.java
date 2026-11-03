class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int max=0;
        while(i<j){
            int len=Math.min(height[i],height[j]);
            int wid=(j-i);
            int area=len*wid;
            max=Math.max(area,max);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }return max;


    }
}