class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }else{
            char top=st.peek();
            if(ch==top){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        }

        while(!st.isEmpty()){
            char top=st.pop();
            st2.push(top);
        }
        StringBuilder ans=new StringBuilder();
        while(!st2.isEmpty()){
            ans.append(st2.pop());
        }
        
        return ans.toString();
    }
}