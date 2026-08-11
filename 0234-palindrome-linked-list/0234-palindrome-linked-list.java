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

        if(head == null || head.next == null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = null;
        ListNode curr = slow;

        while(curr != null){
           ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

         ListNode fstNode = head;
         ListNode sNode = prev;

         while(sNode != null){
            if(fstNode.val != sNode.val){
                return false;
            }
            fstNode = fstNode.next;
            sNode = sNode.next;
         }

         return true;

    }
}