class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^0-9a-zA-Z]","");
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }return true;

        
    }
}