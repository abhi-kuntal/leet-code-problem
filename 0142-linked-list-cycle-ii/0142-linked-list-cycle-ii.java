/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        Boolean iscycle = false;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
               iscycle = true;
               break;
            }
        }
        if(!iscycle){
            return null;
        }

        slow = head;
        while(slow != fast){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}