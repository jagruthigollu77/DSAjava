class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAtMiddle {

    Node head;

    void insertAtEnd(int data) {

        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void insertAfter(int target, int data) {

        Node temp = head;

        while(temp != null && temp.data != target) {
            temp = temp.next;
        }

        if(temp == null) {
            System.out.println("Target node not found");
            return;
        }

        Node newNode = new Node(data);

        newNode.next = temp.next;

        temp.next = newNode;
    }

    void display() {

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        InsertAtMiddle list = new InsertAtMiddle();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.insertAfter(20, 25);

        list.display();
    }
}
