class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        int sign=1;
        while(n>0){
            int rem=n%10;
             sum=sum+rem*sign;
            sign*=-1;
            n=n/10;
        
    
        }
        if(sign==-1){
            return sum;
        }else{
            return -sum;
    }
    }
}
        
    
