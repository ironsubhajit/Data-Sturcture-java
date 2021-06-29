public class SL_ListApp {
    public static void main(String[] args) {
        SinglyLinkedList lList = new SinglyLinkedList();
        for(int i = 0; i < 10; i++){
            lList.add(i);
        }
        lList.printSinglyLinkedList(lList.head);
    }
}
