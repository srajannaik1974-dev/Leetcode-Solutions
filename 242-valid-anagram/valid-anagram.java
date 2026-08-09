class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            char a=t.charAt(i);
            if(!map.containsKey(a)){
                return false;
            }
            map.put(a,map.get(a)-1);

            if(map.get(a)<0){
                return false;
            }
        }return true;
    }
}