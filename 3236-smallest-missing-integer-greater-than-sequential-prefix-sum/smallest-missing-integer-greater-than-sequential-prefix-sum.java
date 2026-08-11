class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        int sum=nums[0];
       
        for(int j=1;j<n;j++){
            if(nums[j]==nums[j-1]+1){
                sum=sum+nums[j];
            }else{
                break;
            }
        }
        
       for(int num:nums){
        set.add(num);
       }
        
       while(set.contains(sum)){
        sum++;
       }return sum;
             
       
    }
}