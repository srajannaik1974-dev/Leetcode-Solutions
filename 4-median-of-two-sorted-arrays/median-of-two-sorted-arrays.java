class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int i=0;
        int j=0;
        int k=0;
        int arr[]=new int[m+n];
        while(i<n && j<m){
            if(nums1[i] <= nums2[j]){
                arr[k]=nums1[i];
                k++;
                i++;
            }else {
                arr[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<n){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k]=nums2[j];
            j++;
            k++;
        }
        int total=m+n;
        if(total%2!=0){
            return arr[k/2];
        }else{
            return (arr[k/2]+arr[k/2-1])/2.0;
        }
    }
}