class Solution {
    public char findTheDifference(String s, String t) {
        char XOR=0;
        for(char c:s.toCharArray()){
            XOR=(char)(XOR^c);
        }
        for(char c:t.toCharArray()){
            XOR=(char)(XOR^c);
        }
        return XOR;
    }
}