class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int cnt=0;
        int max=0;
        for(int num:set){
            if(!set.contains(num-1)){
                cnt=1;
                num++;
            while(set.contains(num)){
                cnt++;
                num++;
            }
            
            max=Math.max(cnt,max);
            }

            
        }return max;
    }
}