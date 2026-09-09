class Solution {
    public long countCommas(long n) {
        long ans=0;
        if(n<1000)return 0;
        if(n>=1000)
        ans=ans+(Math.min(n,999999)-999);
        if(n>=1000000L){
            ans=ans+2*(Math.min(n,999999999L)-999999L);
        }
        if(n>=1000000000L){
            ans=ans+3*(Math.min(n,999999999999L)-999999999L);
        }
        if(n>=1000000000000L){
            ans=ans+4*(Math.min(n,999999999999999L)-999999999999L);
        }
        if(n>=1000000000000000L){
            ans=ans+5*(Math.min(n,999999999999999999L)-999999999999999L);
        }
       return ans;
    }
}