class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        
 
       
        int minsum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            int j=i+1;
             int k=n-1;
        while(j<k){
               int sum=nums[i]+nums[j]+nums[k];
               int rem=Math.abs(sum-target);
               int rem1=Math.abs(minsum-target);
               if(rem<rem1){
                minsum=sum;
               }
               if(sum>target){
                k--;
               }else if(sum<target){
                j++;
               }else{
                return sum;
               }

        }

   }return minsum;
}
}