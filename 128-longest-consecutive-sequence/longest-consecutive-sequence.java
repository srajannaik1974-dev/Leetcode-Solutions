class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        int longest=0;
        int i;
       int  count=0;
        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
        if(!set.contains(num-1)){
           count=1;
           int x=num;
        
        while(set.contains(x+1)){
            count++;
            x=x+1;
        }
longest=Math.max(longest,count);        }
        }
    return longest;
    }
}