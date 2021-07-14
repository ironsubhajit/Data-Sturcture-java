public class reverse_LList {
    public static void main(String[] args) {
        SinglyLinkedList lList = new SinglyLinkedList();
        // create LinkedList
        for(int i = 0; i < 10; i++){
            lList.add(i);
        }
        Node head = lList.head;
        System.out.println("\nCurrent LinkedList: ");
        lList.printSinglyLinkedList(head);

        head = lList.reverse(head);

        System.out.println("\nReversed LinkedList: ");
        lList.printSinglyLinkedList(head);
    }
}
