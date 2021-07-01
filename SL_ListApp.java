public class SL_ListApp {
    public static void main(String[] args) {
        SinglyLinkedList lList = new SinglyLinkedList();
        for(int i = 0; i < 10; i++){
            lList.add(i);
        }
        System.out.println("\n");
        Node head = lList.head;
        for(int i = 10; i < 20; i++){
            head = lList.insertNodeAtTail(head, i);
        }
        lList.printSinglyLinkedList(head);
    }
}
