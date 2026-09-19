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
    public ListNode rotateRight(ListNode head, int k) {
        int length=0;
        ListNode curr=head;
        if(head==null || head.next==null){
            return head;
        }
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        curr=head;
        ListNode dummy=new ListNode(0);
        k=k%length;
        if(k==0)return head;
        
        int limit=length-k;
        ListNode left=head;
        for(int i=1;i<limit;i++){
            curr=curr.next;
        }
        ListNode right=curr.next;
        dummy.next=right;
        curr.next=null;
        curr=right;
        while(curr!=null && curr.next!=null){
            curr=curr.next;
        }
        curr.next=left;
        

        return dummy.next;
    }
}