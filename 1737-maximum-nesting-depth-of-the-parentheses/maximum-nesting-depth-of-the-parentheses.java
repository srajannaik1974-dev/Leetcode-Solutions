class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int i=0;
        int n=s.length();
        int count=0;
        int max=0;
        while(!st.isEmpty() || i<n){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
                count++;
                max=Math.max(count,max);
                i++;
            }else if(s.charAt(i)==')'){
                st.pop();
                count--;
            
                i++;
            }else{
             i++;
            }
        }return max;
    }
}