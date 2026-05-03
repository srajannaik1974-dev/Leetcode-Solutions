class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int i=0,j=n-1;
         int k=n-1;
         while(i<=j){
            int left=nums[i]*nums[i];
            int right=nums[j]*nums[j];
            if(left>right){
                arr[k]=left;
                i++;
                k--;
            }else{
                arr[k]=right;
                j--;
                k--;
            }
         }return arr;
    }

}