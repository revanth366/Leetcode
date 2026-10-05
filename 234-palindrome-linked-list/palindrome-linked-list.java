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
    public boolean isPalindrome(ListNode head) {
        ListNode to=head;
        ListNode ra=head;
        while(ra!=null&&ra.next!=null)
        {
            to=to.next;
            ra=ra.next.next;
        }
        ListNode temp;
        ListNode curr=to;
        ListNode prev=null;
        while(curr!=null)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        while(prev!=null)
        {
            if(prev.val!=head.val)
            {
                return false;
            }
            prev=prev.next;
            head=head.next;
        }
        return true;
    }
}