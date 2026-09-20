class Solution {
    public int reverseDegree(String s) {
        int prod=1;
        
        int result=0;
       
        for(int i=0;i<s.length();i++){
            int index1=26-(s.charAt(i)-'a');
            prod=index1*(i+1);
            result=result+prod;
        }return result;
    }
}