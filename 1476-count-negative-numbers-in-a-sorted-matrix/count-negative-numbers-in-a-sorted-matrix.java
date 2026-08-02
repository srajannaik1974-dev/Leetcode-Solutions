class Solution {
    public int countNegatives(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        for(int i=0;i<n;i++){
            int low=0;
            int high=m-1;
           while(low<=high){
            int mid=(low+high)/2;
            if(grid[i][mid]<0){
                cnt=cnt+high-mid+1;
                high=mid-1; 
            }else{
                low=mid+1;
            }
           }
                  
            
        }return cnt;
    }
}