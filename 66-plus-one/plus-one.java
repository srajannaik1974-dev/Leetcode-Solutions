class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int carry=1;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+carry;
                
                return digits;
               
            }else {
                digits[i]=0;
               
            }
           
        }
        if(carry==1){
         int arr[]=new int[n+1];
            arr[0]=1;
            return arr;
       
     
        }return digits;
    }
}