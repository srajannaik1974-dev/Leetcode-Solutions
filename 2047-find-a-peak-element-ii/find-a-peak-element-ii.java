class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=m-1;
        int arr[]=new int[2];
        while(low<=high){
            int mid=low+(high-low)/2;
            int maxrow=0;
            int row=0;
            for(int i=0;i<n;i++){
                 if(mat[i][mid]>maxrow){
                    maxrow=mat[i][mid];
                     row=i;
                 }
            }
            int left=(mid==0)?-1:mat[row][mid-1];
            int right=(mid==m-1)?-1:mat[row][mid+1];
            if(maxrow>left && maxrow>right){
               arr[0]=row;
               arr[1]=mid;
               return arr;
            }else if(maxrow>left && maxrow<right){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }return arr;
    }
}