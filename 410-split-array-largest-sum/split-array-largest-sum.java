class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int low=0;
        int high=0;
        for(int num:nums){
            low=Math.max(num,low);
            high+=num;
        }
        
        while(low<high){
            int mid=low+(high-low)/2;
            int sum=0;
            int count=1;
            for(int num:nums){
                
                if(sum+num<=mid){
                    sum=sum+num;
                }else{
                    count++;
                    sum=num;
                }
            }
            if(count>k){
                low=mid+1;
            }else{
                high=mid;
            }

        }return low;
    }
}