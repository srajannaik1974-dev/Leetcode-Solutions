class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int c=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            int left=sum-k;
            if(map.containsKey(left)){
                c=c+map.get(left);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }return c;
    }
}