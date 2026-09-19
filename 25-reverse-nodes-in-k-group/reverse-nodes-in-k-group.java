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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head;
        int length=0;
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        int rem=length%k;
        int limit=length-rem;
        curr=head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode tail=dummy;
        for(int i=1;i<=limit;i=i+k){
            ListNode h=tail.next;
             curr=h;
            ListNode prev=null;

            for(int j=1;j<=k;j++){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            tail.next=prev;
            h.next=curr;
            tail=h;
        }return dummy.next;
    }
}