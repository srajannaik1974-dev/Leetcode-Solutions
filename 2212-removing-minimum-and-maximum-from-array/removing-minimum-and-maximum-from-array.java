class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
       
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
            min=Math.min(nums[i],min);
        }
       
        int dist1=0;
        int dist2=0;
        for(int i=0;i<n;i++){
            
                if(nums[i]==max ){
                    dist1=i+1;
                    break;
                }
            }
        
      
        for(int j=n-1;j>=0;j--){
            
                if(nums[j]==max ){
                     dist2=n-j; 
                     break;
                }
            }
           
             int dist3=0;
        int dist4=0;
        for(int i=0;i<n;i++){
            
                if(nums[i]==min ){
                    dist3=i+1;
                    break;
                }
            }
        
      
        for(int j=n-1;j>=0;j--){
            
                if(nums[j]==min ){
                     dist4=n-j; 
                     break;
                }
            }
           int maxd1=Math.max(dist1,dist3);
           int maxd2=Math.max(dist2,dist4);
           int maxd3=Math.min(dist1+dist4,dist2+dist3);
           return Math.min(maxd1,Math.min(maxd2,maxd3));
            
            



        
    }
}