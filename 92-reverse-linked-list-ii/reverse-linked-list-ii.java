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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)
        return head;
        ListNode Dummy=new ListNode(0);
        Dummy.next=head;
        ListNode prevNode=Dummy;
        for(int i=1;i<left;i++){
            prevNode=prevNode.next;
        }

            ListNode curr=prevNode.next;
            ListNode prev=null;
            for(int i=0;i<=right-left;i++){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            ListNode LeftNode=prevNode.next;
            prevNode.next=prev;
            LeftNode.next=curr;


        return Dummy.next;
    }
}