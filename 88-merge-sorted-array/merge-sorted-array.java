class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
    
        ArrayList<Integer>ans=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                ans.add(arr1[i]);
                i++;
            }else{
                ans.add(arr2[j]);
                j++;
            }
        }
        while(i<m){
            ans.add(arr1[i]);
            i++;
        }
        while(j<n){
            ans.add(arr2[j]);
            j++;
        }
        for(int k=0;k<m+n;k++){
            arr1[k]=ans.get(k);
        }

    }
}