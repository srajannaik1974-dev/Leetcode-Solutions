class Solution {
    public int smallestNumber(int n, int t) {
       
        while(true)
        {
            if(product(n)%t==0){
            return n;
        }else{
            n++;
        }
        }
    }
    

        


    public int product(int n){
        int prod=1;
        
        while(n>0){
            int rem=n%10;
            prod*=rem;
            n=n/10;
        }return prod;
    }
}