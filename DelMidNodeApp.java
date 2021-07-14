public class DelMidNodeApp {
    public static void main(String[] args) {
        SinglyLinkedList lList = new SinglyLinkedList();
        Node delN, head; 
        // Add element at tail using 'add' method
        for(int i = 0; i < 10; i++){
            lList.add(i);
        }

        // after creating linedList initilizing head node
        head = lList.head;

        // print all elements
        lList.printSinglyLinkedList(head);
        

        int n = 5;
        delN = lList.search_Node(n, head);
        
        // System.out.println("\nSeached node data= "+delN.data);

        lList.deleteMidNode(delN);

        // printting new list
        System.out.println();
        lList.printSinglyLinkedList(head);
    }
}