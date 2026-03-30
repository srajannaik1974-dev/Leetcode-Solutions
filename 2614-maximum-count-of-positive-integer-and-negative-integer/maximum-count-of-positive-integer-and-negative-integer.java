class Solution {
    public int maximumCount(int[] arr) {
        int n=arr.length;
        int pos=0;
        int neg=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
            if(arr[i]>0 )
            pos++;
            else
            neg++;
        }
        }
        if(pos>neg)return pos;
        else
        return neg;
    }
}