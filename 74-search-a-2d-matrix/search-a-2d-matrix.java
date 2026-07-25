class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0;
        int high=n-1;
        int row=-1;

        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(matrix[mid][0]<=target && matrix[mid][m-1]>=target){
                  row=mid;
                  break;
            }else if(matrix[mid][0]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(row==-1)return false;
        int left=0;
        int right=m-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(matrix[row][mid]==target){
                return true;
            }else if(matrix[row][mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }return false;

    }
}