class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int m=nums.length;
        int arr[]=new int[m];
        int k=0;
        int j=n;
        int i=0;
        while(k<n){
            arr[i]=nums[k];
            arr[i+1]=nums[j];
            
            j++;
            k++;
            i=i+2;
        
        }return arr;
    }
}