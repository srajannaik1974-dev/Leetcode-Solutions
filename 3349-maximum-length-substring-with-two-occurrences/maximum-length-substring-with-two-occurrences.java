class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int maxlen=0;
        for(int i=0;i<n;i++){
            int freq[]=new int[26];
             
           for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
            if(freq[s.charAt(j)-'a']>2){
                
                  break;
            }
            maxlen=Math.max(maxlen,j-i+1);
           }
           
          
        }return maxlen;
    }
}