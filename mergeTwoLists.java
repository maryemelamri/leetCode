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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(); 
        ListNode current = dummy; 

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1; // Link current to list1
                list1 = list1.next; // Move list1 pointer forward
            } else {
                current.next = list2; // Link current to list2
                list2 = list2.next; // Move list2 pointer forward
            }
            current = current.next; // Move current pointer forward in the merged list
        }

        // Attach remaining nodes from list1 or list2 (if any)
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next; // Return the merged list starting from the next of dummy node
    }
}
