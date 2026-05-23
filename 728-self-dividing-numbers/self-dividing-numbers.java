class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr=new ArrayList<>();
      for(int i=left;i<=right;i++){
        int temp=i;
        while(temp>0){
            int rem=temp%10;
            if(rem==0 || i%rem!=0){
                break;

                
            }
            if(i%rem==0){
            temp=temp/10;
            }
            if(temp==0)
            arr.add(i);
            

        }
      }return arr;
          
    }
}