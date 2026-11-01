class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int row=0;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][m-1]){
                row=mid;
                break;
            }else if(target>matrix[mid][m-1]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        low=0;
        high=m-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target==matrix[row][mid]){
                return true;
            }else if(target>matrix[row][mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }return false;

    }
}