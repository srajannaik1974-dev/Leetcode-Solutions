/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr=headA;
        int length1=0;
        while(curr!=null){
            length1++;
            curr=curr.next;
        }
        curr=headB;
        int length2=0;
        while(curr!=null){
            length2++;
            curr=curr.next;
        }
        int diff=0;
        if(length1>length2){
            diff=length1-length2;
        }else{
            diff=length2-length1;
        }
        ListNode slow=headA;
        ListNode fast=headB;
        if(length2>length1){
            for(int i=1;i<=diff;i++){
                fast=fast.next;
            }
        }else{
            for(int i=1;i<=diff;i++){
                slow=slow.next;
            }
        }
        while(slow!=fast && slow!=null && fast!=null){
            slow=slow.next;
            fast=fast.next;
        }return slow;
    }
}