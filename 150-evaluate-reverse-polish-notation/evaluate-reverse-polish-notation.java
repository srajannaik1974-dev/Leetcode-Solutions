class Solution {
    public int evalRPN(String[] nums) {
        Stack<Integer> st=new Stack<>();
        
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i].equals("+")){
                int d=st.pop();
                int u=st.pop();
                st.push(d+u);
            }else if(nums[i].equals("-")){
                int u=st.pop();
                int d=st.pop();
                
                st.push(d-u);
            }else if(nums[i].equals("/")){
                int u=st.pop();
                int d=st.pop();
                
                st.push(d/u);
            }else if(nums[i].equals("*")){
                int d=st.pop();
                int u=st.pop();
                st.push(d*u);
            }else{
                st.push(Integer.parseInt(nums[i]));
            }
        }return st.peek();
    }
}