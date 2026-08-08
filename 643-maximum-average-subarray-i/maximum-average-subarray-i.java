class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double sum=0;
        
        for( int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        int i=k;
        double maxavg=sum/k;
        int j=0;
        double avg=sum/k;
        while(i<n){
           
          
            sum=sum+nums[i]-nums[j];
            avg=sum/k;
            maxavg=Math.max(maxavg,avg);
            i++;
            j++;
            

        }return maxavg;

    }
}