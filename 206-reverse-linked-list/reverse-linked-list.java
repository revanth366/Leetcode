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
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> a=new ArrayList<>();
        while(temp!=null)
        {
            a.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        for(int i=a.size()-1;i>=0;i--)
        {
            temp.val=a.get(i);
            temp=temp.next;
        }
        return head;
    }
}