class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int max=Integer.MIN_VALUE;
        for(int num : nums){
            set.add(num);
            max=Math.max(max,num);
        }
        int i=1;
        int val=Integer.MAX_VALUE;
       while(i<val){
            if(!set.contains(i)){
                return i;
            }
            i++;
           
        } return 1;
    }
    }
