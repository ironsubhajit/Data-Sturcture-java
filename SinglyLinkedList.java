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
    
    // check a node is emoty or not
    boolean isEmpty(Node n){
        return n == null;
    }

    // add new node at tail
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
    
    // insert node at tail same as add method
    Node insertNodeAtTail(Node head, int data) {
        Node temp = head;
        if (head == null){
            head = new Node(data);
            return head;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(data);
        return head;  
    }
    
    // get kthToLast Element
    Node kthToLast(Node head, int k){
        Node slow = head;
        Node fast = head;
        
        // move fast node to kth position from head position
        for(int i=0; i<k; i++){
            if(fast==null) return null;
            fast = fast.next;
        }

        // move both node with same pace till fast node hits end
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    // print Node
    void printNode(Node node){
        if(node == null){
            System.err.println("Node is null");
            return;
        }
        System.out.println("Node Value is: "+node.data);
    }

    // print linkedlist argument head node
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
