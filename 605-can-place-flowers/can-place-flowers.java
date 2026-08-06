class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        int m=nums.length;
        int count=0;
        for(int i=0;i<m;i++){
            if(nums[i]==0){
        if((i==0 || nums[i-1]==0) && (i==m-1 || nums[i+1]==0)){
            nums[i]=1;
          count++;
        
       
        }
        }
      
    }  return count>=n;
}
}