class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int max=0;
        int height=0;
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]>arr[j]){
             height=arr[j];
            
            }else{
               height=arr[i];
              
            }
            int width=j-i;
           int area=height*width;
           if(area>max){
           max=area;
           }
           if(arr[i]>arr[j])
           j--;
           else
           i++;
        }return max;
        
    }
}