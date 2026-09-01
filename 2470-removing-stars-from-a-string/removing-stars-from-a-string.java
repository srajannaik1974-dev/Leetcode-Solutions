class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                st.push(s.charAt(i));
            }else{
                st.pop();
            }
        }
        char[] result=new char[st.size()];
        int i=0;
        while(!st.isEmpty()){
            char top=st.pop();
            result[i]=top;
            i++;
        }
        int j=0;
        int k=result.length-1;
        while(j<k){
           char temp= result[j];
           result[j]=result[k];
           result[k]=temp;
           j++;
           k--;
        }return new String(result);
        
    }
}