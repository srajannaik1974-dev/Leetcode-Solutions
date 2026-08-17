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
        int len1=0;
        
        while(curr!=null){
            curr=curr.next;
            len1++;
        }
        curr=headB;
        int len2=0;
        while(curr!=null){
            curr=curr.next;
            len2++;
        }
        int diff;
        if(len1>len2){
            diff=len1-len2;
            while(diff>0){
                headA=headA.next;
                diff--;
            }

           
        }else{
           diff=len2-len1;
           while(diff>0){
            headB=headB.next;
            diff--;
           }
        
        }
        ListNode slow=headA;
        ListNode fast=headB;
      
           
            while(slow!=fast){
             slow=slow.next;
             fast=fast.next;
                
            }
        return slow;
    }
}