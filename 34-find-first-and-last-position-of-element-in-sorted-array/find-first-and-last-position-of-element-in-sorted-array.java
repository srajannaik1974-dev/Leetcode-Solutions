class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int [] arr=new int[2];
        int low=0,high=n-1;
        int index1=-1;
        while(low<=high){
        
            int mid=(low+high)/2;
            if(nums[mid]==target){
            index1= mid;
            high=mid-1;
            }
            else if(nums[mid]>target)
            high=mid-1;
            else
            low=mid+1;
        }arr[0]=index1;

        int index2=-1;
        low=0;
        high=n-1;
         while(low<=high){
             int mid=(low+high)/2;
            if(nums[mid]==target){
            index2= mid;
            low=mid+1;
            }
            else if(nums[mid]>target)
            high=mid-1;
            else
            low=mid+1;

    }arr[1]=index2;
    return arr;
}
}