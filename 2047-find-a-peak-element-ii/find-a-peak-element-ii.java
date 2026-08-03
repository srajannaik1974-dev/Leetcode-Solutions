class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int arr[]=new int[2];
        int max=mat[0][0];
        int row=0;
        int col=0;
        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
            if(mat[i][j]>max){
                max=mat[i][j];
                 row=i;
                 col=j;
            }
           }
        }
        arr[0]=row;
        arr[1]=col;
        return arr;
        
    }
}