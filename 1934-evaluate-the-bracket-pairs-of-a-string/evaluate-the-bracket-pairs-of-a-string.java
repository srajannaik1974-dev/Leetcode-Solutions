class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<knowledge.size();i++){
            String key=knowledge.get(i).get(0);
            String value=knowledge.get(i).get(1);

            map.put(key,value);
        }
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                int j=i+1;
            
            while(s.charAt(j)!=')'){
                j++;
            }
             String key=s.substring(i+1,j);
             if(map.containsKey(key)){
                ans.append(map.get(key));

             }else{
                ans.append('?');
             }
             i=j+1;
        }else{
            ans.append(s.charAt(i));
            i++;
        }
        }return ans.toString();

    }
}