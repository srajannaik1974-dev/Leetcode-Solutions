class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][]=new int[n][n];
        int top=0;
        int right=n-1;
        int bottom=n-1;
        int left=0;
        int num=1;
        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++){
                ans[top][j]=num;
                num++;
            }top++;
              for(int i=top;i<=bottom;i++){
                ans[i][bottom]=num;
                num++;
            }right--;
              for(int j=right;j>=left;j--){
                ans[bottom][j]=num;
                num++;
            }bottom--;
              for(int i=bottom;i>=top;i--){
                ans[i][left]=num;
                num++;
            }left++;
        }return ans;


    }
}