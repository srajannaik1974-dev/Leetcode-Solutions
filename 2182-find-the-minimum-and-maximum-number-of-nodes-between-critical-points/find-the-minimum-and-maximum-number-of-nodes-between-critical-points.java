/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int arr[]=new int[2];
        int min=Integer.MAX_VALUE;
        int max=0;
        int first=-1;
        int last=-1;
        int index=0;

        ListNode prev=head;
        ListNode curr=head.next;
        while(curr.next!=null){
            if(curr.val>prev.val && curr.val>curr.next.val || curr.val<prev.val && curr.val<curr.next.val){
                if(first==-1){
                    first=index+1;
                }else{
                    min=Math.min(min,(index+1)-last);
                    max=Math.max(max,(index+1)-first);
                }
                last=index+1;

            }
            prev=curr;
            curr=curr.next;
            index++;
        }
        if(first==-1 || first==last ){
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        arr[0]=min;
        arr[1]=max;
        return arr;
        
    }
}