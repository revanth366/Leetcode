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
    public ListNode middleNode(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode temp=head;
        int l=0;
        while(temp!=null){
            temp=temp.next;
            l++;
        }
        int m=l/2;
        temp=head;
        while(m>0)
        {
            temp=temp.next;
            m--;
        }
        return temp;
    }
}