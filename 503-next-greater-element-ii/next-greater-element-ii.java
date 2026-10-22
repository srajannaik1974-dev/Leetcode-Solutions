class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack();
        for(int i=n-1;i>=0;i--){
            st.push(nums[i]);
        }
        int arr[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i]){
                st.pop();
            }
            
            if(st.isEmpty()){
                arr[i]=-1;
                st.push(nums[i]);
            }else if(st.peek()>nums[i]){
                arr[i]=st.peek();
                st.push(nums[i]);
            }
        }return arr;
    }
}