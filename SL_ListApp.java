public class SL_ListApp {
    public static void main(String[] args) {
        SinglyLinkedList lList = new SinglyLinkedList();
        
        // Add element at tail using 'add' method
        for(int i = 0; i < 10; i++){
            lList.add(i);
        }
        
        System.out.println("\n");
        
        Node head = lList.head;
        // insert element tail using 'insertNodeAtTail' method (hackerrank sol.)
        for(int i = 10; i < 20; i++){
            head = lList.insertNodeAtTail(head, i);
        }
        lList.printSinglyLinkedList(head);
    }
}
