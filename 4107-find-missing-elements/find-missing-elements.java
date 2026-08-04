class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        List<Integer> arr=new ArrayList<>();
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int num:nums){
            set.add(num);
            if(num>max){
               max=num;
            }
             if(num<min){
                min=num;
            }
        }
        // for(int i=0;i<n;i++){
        //     if(nums[i]>max){
        //         max=nums[i];
        //     }else if(nums[i]<min){
        //         min=nums[i];
        //     }
        // }
       for(int i=min;i<=max;i++){
        if(!set.contains(i)){
           arr.add(i);
        }
            
        }
       return arr;

        
    }
}