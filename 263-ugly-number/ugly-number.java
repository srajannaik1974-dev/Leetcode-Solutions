class Solution {
    public boolean isUgly(int n) {
        int factors[]={2,3,5};
        if(n==0)return false;
        for(int fact:factors){
            while(n%fact==0)
            n=n/fact;
        }return n==1;

       
    }
}