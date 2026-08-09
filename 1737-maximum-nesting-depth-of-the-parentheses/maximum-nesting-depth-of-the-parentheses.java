class Solution {
    public int maxDepth(String s) {
      Stack<Character> st=new Stack<>();
      int max=0;
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if( ch=='('){
            st.push(ch);
            int top=st.size();
            max=Math.max(max,top);
        }else if(ch==')'){
            st.pop();
        }else{
            continue;
        }
      }return max;
    }
}