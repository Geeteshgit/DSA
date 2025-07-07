package Linked_List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        int len = 0;
        int pos = 0;
        ListNode temp = head;
        ListNode ans = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        while (pos != (len / 2)) {
            ans = ans.next;
            pos++;
        }
        return ans;
    }
}
