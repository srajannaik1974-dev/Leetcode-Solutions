class Solution {
    public int longestSubsequence(int[] nums) {
        int XOR=0;
        int n=nums.length;
        for(int num:nums){
            XOR=XOR^num;
        }
        if(XOR!=0){
            return n;
        }

        for(int num:nums){
            if(num!=0){
                return n-1;
            }
        }

       
        return 0;
        }
    }
