class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=arr.length;
        int diff=0;
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            diff=arr[i]-arr[i-1];
            min=Math.min(diff,min);
        }
        for(int i=1;i<n;i++){
            if(arr[i]-arr[i-1]==min){
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }return ans;
    }
}