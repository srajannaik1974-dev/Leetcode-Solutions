class Solution {
    public long countCommas(long n) {
        long curr=1000;
        long res=0;
        while(curr<=n){
            res=res+(n-curr)+1;
            curr=curr*1000;
        }return res;
    }
}