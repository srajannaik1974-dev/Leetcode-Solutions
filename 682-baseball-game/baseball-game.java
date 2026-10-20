class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st=new Stack<>();
        int n=op.length;
        for(int i=0;i<n;i++){
            
            
            if(op[i].equals("+")){
                int top=st.pop();
                int sec=st.peek();
                st.push(top);
                st.push(top+sec);
            }else if(op[i].equals("D")){
                st.push(st.peek()*2);
            }else if(op[i].equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(op[i]));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }return sum;

    }
}