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

public class Insert_At_Head {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5 };
        Node head = new Node(arr[0]);
        Node curr = head;
        for(int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            curr.next = temp;
            curr = curr.next;
        }
        Node newNode = new Node(6);
        newNode.next = head;
        head = newNode;
        Node tcurr = head;
        while(tcurr != null) {
            System.out.print(tcurr.data + " -> ");
            tcurr = tcurr.next;
        }
        System.out.println("null");
    }
}
