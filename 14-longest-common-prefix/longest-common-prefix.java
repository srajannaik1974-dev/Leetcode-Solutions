class Solution {
    public String longestCommonPrefix(String[] str) {
        int n=str.length;
         String prefix=str[0];
        for(int i=0;i<n;i++){
           while(!str[i].startsWith(prefix)){
            prefix=prefix.substring(0,prefix.length()-1);
           }
                
            }return prefix;
            
        }

    }
