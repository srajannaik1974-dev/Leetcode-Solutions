class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int arr[]=new int[m+n];
        
        for(int i=0;i<n;i++){
            arr[i]=nums1[i];
         
        }
        int i=n;
        for(int num:nums2){
            arr[i]=num;
            i++;
        }
        Arrays.sort(arr);
        int k=arr.length;
    
       
       
           
            if(k%2==0){
                 return (arr[k/2]+arr[k/2 -1])/2.0;
            }else{
               
                return arr[k/2];
            }
        
    }
}