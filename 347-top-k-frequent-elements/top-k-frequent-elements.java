class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(
        (a,b)->map.get(b)-map.get(a)
        );
        for(int key:map.keySet()){
            pq.add(key);
        }
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=pq.poll();
        }return arr;

    }
}