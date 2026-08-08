class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
         HashSet<Integer> set2=new HashSet<>();
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<m;i++){
            if(set.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        int[] arr=new int[set2.size()];
        int i=0;
        for(int num:set2){
             arr[i++]=num;
        }return arr;
    }
}