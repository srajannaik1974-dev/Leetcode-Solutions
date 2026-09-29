class Solution {
    public int mySqrt(int x) {
        long low=1;
        long high=x;
        long sqrt=0;
        while(low<=high){
            long mid=(low+high)/2;
            if(mid*mid==x){
                return (int)mid;
            }else if(mid*mid>x){
                high=mid-1;
            }else{
                sqrt=mid;
                low=mid+1;
            }
        }return (int)sqrt;
    }
}