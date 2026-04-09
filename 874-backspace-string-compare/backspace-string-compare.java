class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder st1=new StringBuilder();
        StringBuilder st2=new StringBuilder();
        for(char ch :s.toCharArray()){
            if(ch!='#'){
                st1.append(ch);
            }else
            {
                if(st1.length()>0){
                    st1.deleteCharAt(st1.length()-1);
                }
            }
        }
         for(char ch :t.toCharArray()){
            if(ch!='#'){
                st2.append(ch);
            }else
            {
                if(st2.length()>0){
                    st2.deleteCharAt(st2.length()-1);
                }
            }
        }return st1.toString().equals (st2.toString());
    }
}