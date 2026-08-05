class Solution {
    public String removeOuterParentheses(String s){
        Stack <Character> st=new Stack<>();
        StringBuilder arr=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(!st.isEmpty()){
                arr.append(ch);
            }
            st.push(ch);
            }else{
                st.pop();
                if(!st.isEmpty()){
                    arr.append(ch);
                }
            }
        }return arr.toString();
    }
}