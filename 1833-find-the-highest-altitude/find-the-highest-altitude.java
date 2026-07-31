class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int ans[]=new int [n+1];
        ans[0]=0;
        for(int i=0;i<n;i++){
            ans[i+1]=ans[i]+gain[i];
        }
        int m=ans.length;
        int alt=ans[0];
        for(int i=1;i<m;i++){
            if(ans[i]>alt){
                alt=ans[i];
            }
        }return alt;
    }
}