class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        
        for(int i=2;i<n;i++){
            int top1=arr1.get(arr1.size()-1);
            int top2=arr2.get(arr2.size()-1);
            if(top1>top2){
                arr1.add(nums[i]);
               
            }else{
                arr2.add(nums[i]);

              
            }
        }
           
          
           for(int l=0;l<arr2.size();l++){
            arr1.add(arr2.get(l));
           }
           int[] result=new int[n];
           for(int i=0;i<n;i++){
            result[i]=arr1.get(i);
           }return result;
            

    }
}