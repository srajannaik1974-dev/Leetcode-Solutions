class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int n=nums1.length;
       int m=nums2.length;
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
        int j=0;
        while(j<m && nums1[i]!=nums2[j]){
            j++;
        }
        int k=j+1;
        while(k<m && nums2[k]<=nums1[i]){
            k++;
        }
        if( k<m && nums2[k]>nums2[j]){
            arr[i]=nums2[k];
        }else{
            arr[i]=-1;
        }
       }return arr; 
    }
}