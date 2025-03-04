/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        ListNode dummy = new ListNode(0, null);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null) {
            if (set.contains(current.next.val)) {
                current.next = current.next.next;
            } else
                current = current.next;
        }

        return dummy.next;
    }
}