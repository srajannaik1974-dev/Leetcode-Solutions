class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        int max=0;
        int count=0;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int num:set){
        if(!set.contains(num-1)){
            int current=num;
            count=1;
            while(set.contains(current+1)){
                current++;
                   count++;
                  
            }
             
        }
        max=Math.max(count,max);
        }return max;
    }
}