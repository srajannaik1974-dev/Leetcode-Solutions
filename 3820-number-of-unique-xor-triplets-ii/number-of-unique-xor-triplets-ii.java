class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        HashSet <Integer> set= new HashSet<>();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                set.add(nums[i]^nums[j]);
            }
        }
        HashSet<Integer> ans=new HashSet<>();
        for(int i:set){
            for(int j:nums){
                ans.add(i^j);
            }
        }
        for(int num:nums){
            ans.add(num);
        }
        return ans.size();
    }
}