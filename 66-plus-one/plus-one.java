class Solution {
    public int[] plusOne(int[] arr) {
        
        int n=arr.length-1;
        int carry=1;
        for(int i=n;i>=0;i--){
            int sum=arr[i]+carry;
            if(sum<10){

                arr[i]=sum;
                carry=0;
            }else{
                arr[i]=0;
                carry=1;
            }
        }
             if(carry==1){
                int [] result=new int [arr.length+1];
                result[0]=1;
                return result;
            }return arr;
    }
       
    
}