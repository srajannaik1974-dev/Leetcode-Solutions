class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0;
        int high=n-1;
        int row=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[mid][0]<=target && matrix[mid][m-1]>=target){
                 row=mid;
                 break;
            }else if(matrix[mid][0]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
         low=0;
         high=m-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[row][mid]==target){
                return true;
            }else if(matrix[row][mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return false;

    }
}