class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        long pow=Math.abs((long)n);
        while(pow>0){
            if(pow%2!=0){
                ans=ans*x;
            }
            x=x*x;
            pow=pow/2;
        }
        if(n>0){
            return ans;
        }else{
            return 1/ans;
        }
    }
}