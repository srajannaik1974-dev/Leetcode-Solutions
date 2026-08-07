class Solution {
    public int calPoints(String[] operations) {
        int  n=operations.length;
        Stack<Integer> st=new Stack<>();
        int top=st.size()-1;
        int sectop=st.size()-2;
        int sum=0;
        for(String op:operations){
            if(op.equals("+")){
               top=st.get(st.size()-1);
               sectop=st.get(st.size()-2);
               st.push(top+sectop);
            }else if(op.equals("D")){
                top=st.get(st.size()-1);
                st.push(top*2);
            }else if(op.equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(op));
            }
        }
        for(int num:st){
            sum=sum+num;
        }return sum;
    }
}