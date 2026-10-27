class Solution {
    public int[] finalPrices(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack();
        int arr[]=new int[n];
        arr[n-1]=nums[n-1];
        st.push(nums[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek()>nums[i]){
                st.pop();
            }
            if(!st.isEmpty() && nums[i]>=st.peek()){
                int sum=nums[i]-st.peek();
                arr[i]=sum;
            }else{
                arr[i]=nums[i];
            }
            st.push(nums[i]);
        }return arr;

    }
}