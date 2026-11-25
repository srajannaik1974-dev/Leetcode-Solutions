class Solution {
    public String addBinary(String a, String b) {
        int n=a.length();
        int m=b.length();
        if(a.equals("0") && b.equals("0")){
            return "0";
        }
        int size=Math.max(n,m);
        int[] arr=new int[size+1];
        int carry=0;
        int k=arr.length-1;
        int i=n-1;
        int j=m-1;
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0){
             sum+=a.charAt(i)-'0';
             i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            arr[k]=sum%2;
            carry=sum/2;
           
           k--;
        }
        arr[0]=carry;
        
        StringBuilder sb=new StringBuilder();
        for(int l=0;l<arr.length;l++){
            if(sb.length()==0 && arr[l]==0){
                continue;
            }
            sb.append(arr[l]);
        }return sb.toString();
    }
}