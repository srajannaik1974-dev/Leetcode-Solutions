class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st=new Stack<>();
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]>0){
                st.push(a[i]);
            }else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<-a[i]){
                    st.pop();
                }
                if(st.isEmpty()|| st.peek()<0){
                    st.push(a[i]);
                }else if(st.peek()==-a[i]){
                    st.pop();
                }
            }
        }
        int []ans=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}