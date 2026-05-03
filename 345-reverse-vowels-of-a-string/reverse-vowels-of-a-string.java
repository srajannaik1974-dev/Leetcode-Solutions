class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        char arr[]=s.toCharArray();
        while(i<j){
            if((arr[i]=='a' ||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A' ||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U') &&(arr[j]=='a' ||arr[j]=='e'||arr[j]=='i'||arr[j]=='o'||arr[j]=='u'||arr[j]=='A' ||arr[j]=='E'||arr[j]=='I'||arr[j]=='O'||arr[j]=='U')) {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }else if((arr[i]=='a' ||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A' ||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U') &&(arr[j]!='a' ||arr[j]!='e'||arr[j]!='i'||arr[j]!='o'||arr[j]!='u'||arr[j]!='A' ||arr[j]!='E'||arr[j]!='I'||arr[j]!='O'||arr[j]!='U')) {
                                  j--;
            }else{
                i++;
            }
    
            
        }return new String(arr);
    }
}