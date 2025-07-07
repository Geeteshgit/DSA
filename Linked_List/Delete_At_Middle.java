package Linked_List;

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Delete_At_Middle {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int pos = 3;
        Node head = new Node(arr[0]);
        Node curr = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            curr.next = temp;
            curr = curr.next;
        }

        Node currNode = head;
        int count = 1;
        while (count != pos - 1) {
            currNode = currNode.next;
            count++;
        }
        currNode.next = currNode.next.next;
        Node tcurr = head;
        while (tcurr != null) {
            System.out.print(tcurr.data + " -> ");
            tcurr = tcurr.next;
        }
        System.out.println("null");
    }
}
