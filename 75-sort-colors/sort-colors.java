class Solution {
    public void sortColors(int[] nums) {
    int n=nums.length;
    int i=0,j=0,k=n-1;
  
  
    while(i<=k){
        if(nums[i]==0){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            
            i++;
            j++;
        

        }else if(nums[i]==2) {
            int temp=nums[i];
            nums[i]=nums[k];
            nums[k]=temp;
          
        k--;
        }else{
            i++;
        }
      
    }
    }
}
