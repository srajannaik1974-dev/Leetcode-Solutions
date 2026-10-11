class Solution {
    public boolean judgeSquareSum(int c) {
        long low=0;
        long high=(long)Math.sqrt(c);
        while(low<=high){
           
            long low1=low*low;
            long high1=high*high;
            if(low1+high1==c){
                return true;
            }else if(low1+high1<c){
                low++;
            }else{
                high--;
            }
        }return false;
    }
}