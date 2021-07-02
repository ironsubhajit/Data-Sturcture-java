public class deleteEle {
    public static void main(String[] args) {
        SinglyLinkedList lList = new SinglyLinkedList();
        for(int i = 0; i < 10; i++){
            lList.add(i);
        }
        for(int i = 0; i < 6; i++){
            lList.add(i);
        }
        System.out.println("\nCurrent LinkedList: ");
        lList.printSinglyLinkedList(lList.head);
        
        // TC: O(N)
        lList.deleteDupsOp(lList.head);

        System.out.println("\nLinkedList after duplicates deletation (using optimal solution): ");
        lList.printSinglyLinkedList(lList.head);
        for(int i = 0; i < 10; i++){
            lList.add(i);
        }
        for(int i = 0; i < 6; i++){
            lList.add(i);
        }
        System.out.println("\nCurrent LinkedList: ");
        lList.printSinglyLinkedList(lList.head);

        // SPACE COMPLEXCITY: O(1) & TC: O(N^2)
        lList.deleteDups(lList.head);

        System.out.println("\nLinkedList after duplicates deletation (buffer not used): ");
        lList.printSinglyLinkedList(lList.head);
    }
}
