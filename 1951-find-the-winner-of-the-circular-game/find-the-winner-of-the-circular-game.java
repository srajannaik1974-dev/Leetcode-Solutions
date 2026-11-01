class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();
         int count=0;
         for(int i=1;i<=n;i++){
            q.add(i);
         }
        
           while(q.size()>1){
            if(count==k-1){
                count=0;
                q.remove();
            }else{
                q.add(q.remove());
                count++;
            }
           }
        return q.peek();
    }
}