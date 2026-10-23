class Solution {
    public int[] canSeePersonsCount(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack();
        int arr[]=new int[n];
        arr[n-1]=0;
        int count=0;
        st.push(nums[n-1]);
        for(int i=n-2;i>=0;i--){
            count=0;
            while(!st.isEmpty() && st.peek()<nums[i]){
                st.pop();
                count++;
            }
            if(!st.isEmpty() && st.peek()>nums[i]){
                
                count++;
            }
            arr[i]=count;
            st.push(nums[i]);
        }return arr;
    }
}