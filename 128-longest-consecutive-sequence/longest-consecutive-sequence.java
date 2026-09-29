class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
       
        int max=0;
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                
                
             int count=0;
            
            while(set.contains(num)){
                count++;
                num=num+1;
                
            }
            max=Math.max(count,max);
            }
        }return max;
    }
}