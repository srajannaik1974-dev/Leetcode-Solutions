class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int imax=height[i];
        int jmax=height[j];
        int count=0;
        while(i<j){
            if(imax<=jmax){
                i++;
                imax=Math.max(imax,height[i]);
                count=count+(imax-height[i]);

            }else if(imax>jmax){
                j--;
                jmax=Math.max(jmax,height[j]);
                count=count+(jmax-height[j]);
        }
        }return count;
    }
}