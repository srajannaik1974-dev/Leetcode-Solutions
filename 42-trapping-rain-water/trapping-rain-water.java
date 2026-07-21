class Solution {
    public int trap(int[] height) {
       int n=height.length;
       int sum=0;
       int i=0;
       int j=n-1;
      int imax=height[i];
      int jmax=height[j];
      while(i<j){
        if(imax<=jmax){
            i++;
            imax=Math.max(height[i],imax);
            sum=sum+(imax-height[i]);
        }else{
            j--;
            jmax=Math.max(height[j],jmax);
            sum=sum+(jmax-height[j]);

        }
      }return sum;

    }
}