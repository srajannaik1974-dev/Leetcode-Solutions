class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> arr=new HashMap<>();
        arr.put(0,1);
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            int left=sum-k;
            if(arr.containsKey(left)){
                count=count+arr.get(left);
            }
            arr.put(sum,arr.getOrDefault(sum,0)+1);
        }return count;
    }
}