class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int result=0;
        int alt=0;
        for(int i=0;i<n;i++){
            alt=alt+gain[i];
            result=Math.max(alt,result);
        }return result;
    }
}