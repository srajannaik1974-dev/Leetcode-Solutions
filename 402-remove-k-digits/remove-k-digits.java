class Solution {
    public String removeKdigits(String s, int k) {
        Stack<Character> st=new Stack();
        for(char num:s.toCharArray()){
            while(k>0 && !st.isEmpty() && num<st.peek()){
                st.pop();
                k--;
            }
            st.push(num);
        }
        while(k>0){
            st.pop();
            k--;
        }

    
        StringBuilder sb=new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        int i=0;
        while(i<sb.length() && sb.charAt(i)=='0'){
            i++;
        }
        String result=sb.substring(i,sb.length());
        return result.isEmpty()?"0":result;
    }
}