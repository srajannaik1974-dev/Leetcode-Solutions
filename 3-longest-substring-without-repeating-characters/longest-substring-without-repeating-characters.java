class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int max=0;
        int count=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                count--;
                left++;
                
            }
            if(!set.contains(ch)){
                count++;
                max=Math.max(count,max);
            }
            set.add(ch);
        }return max;
    }
}