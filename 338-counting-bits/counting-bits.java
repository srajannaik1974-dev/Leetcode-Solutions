class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        int num=0;
        int number=0;
        int i=0;
        while(number<=n){
            num=number;
            int count=0;
            while(num!=0){
                num=(num&num-1);
                count++;
            }
            arr[i]=count;
            i++;
            number++;
        }return arr;
    }
}