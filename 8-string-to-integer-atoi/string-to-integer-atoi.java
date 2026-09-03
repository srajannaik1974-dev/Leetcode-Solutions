class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        StringBuilder arr=new StringBuilder();
        int i=0;
        if(s.length()==0){
            return 0;
        }
       
        int sign=1;
        
        if(s.charAt(i)=='-'){
         sign=-1;
         i++;
        }else if(s.charAt(i)=='+'){
            i++;
        }
        while(i<s.length()){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                arr.append(s.charAt(i));
                i++;
            }else{
                break;
            }
        }
        if(arr.length()==0){
            return 0;
        }
        int num=0;
        for(int j=0;j<arr.length();j++){
            int digit=arr.charAt(j)-'0';
            if(num>(Integer.MAX_VALUE-digit)/10){
                  if(sign==1){
                    return Integer.MAX_VALUE;
                  }else{
                    return Integer.MIN_VALUE;
                  }
            }
            num=num*10+digit;
        }
        return num*sign;

    }
}