class Solution {
    public int addDigits(int n) {
        int ans;
        if(n==0) return n;
        
           ans= n%9;
           if(ans==0)
           return 9;
        return ans;

    }
}