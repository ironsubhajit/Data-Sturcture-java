class Node{
    Node next;
    int data;
    Node(int data){
        this.data = data;
        next = null;
    }
}

public class SinglyLinkedList {
    Node head;

    boolean isEmpty(Node n){
        return n == null;
    }

    void add(int data){
        Node toAdd = new Node(data);
        Node temp = head;
        
        if(isEmpty(head)){
            head = toAdd;
            return;
        }

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = toAdd;
        return;
    }

    void printSinglyLinkedList(Node temp){
        if(temp == null){
            return;
        }
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        return;
    }
}
