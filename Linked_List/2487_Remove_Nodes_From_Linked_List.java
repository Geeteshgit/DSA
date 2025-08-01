class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        ListNode reversed = reverse(head);
        ListNode curr = reversed;
        ListNode prev = null;
        int max = -1;
        while(curr != null) {
            if(curr.val >= max) {
                max = curr.val;
                prev = curr;
                curr = curr.next;
            }
            else {
                curr = curr.next;
                prev.next = curr;
            }
        }
        return reverse(reversed);
    }
}