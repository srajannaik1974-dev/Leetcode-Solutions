class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int count=0;
        int max=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int num:set){
           
            if(!set.contains(num-1)){
                    count=1;
            
            
            while(set.contains(num+1)){
                count++;
              num++;
            }
            }
            max=Math.max(count,max);
        }return max;
    }
}