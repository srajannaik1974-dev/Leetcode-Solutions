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
        if(head==null || head.next==null){
            return head;
        }
        ListNode curr1=head;
        int len=0;
        while(curr1.next!=null){
            len++;
            curr1=curr1.next;
        }
        len=len+1;
        k=k%len;
        if(k==0)
        return head;
     
        ListNode curr=head;
        for(int i=1;i<len-k;i++){
            curr=curr.next;
        }
        ListNode right=curr.next;
        curr.next=null;
        curr1.next=head;
        return right;

    }
}