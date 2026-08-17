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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int length=0;
        if(head==null || head.next==null)
        return null;
        while(curr!=null){
           curr=curr.next;
           length++;
        }
        if(n==length)
        return head.next;
        curr=head;
        int node=length-n;
        for(int i=1;i<=node-1;i++){
             curr=curr.next;
        }
        curr.next=curr.next.next;   
        return head;
         }
}