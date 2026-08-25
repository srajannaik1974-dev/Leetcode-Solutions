class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        int max=0;
        for(int num:nums){
            max=Math.max(num,max);
            set.add(num);
        }
        for(int i=1;i<=Integer.MAX_VALUE;i++){
            int div=k*i;
            if(!set.contains(div)){
                return div;
            }
        }return -1;
    }
}