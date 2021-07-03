import java.util.Scanner;

public class kthToLastApp {
    public static void main(String[] args) {
        SinglyLinkedList lList = new SinglyLinkedList();
        // create LinkedList
        for(int i = 0; i < 10; i++){
            lList.add(i);
        }
        System.out.println("\nCurrent LinkedList: ");
        lList.printSinglyLinkedList(lList.head);
        Scanner scan = new Scanner(System.in);
        System.out.println("\nStart: 1\nEnd: 2");
        int con = scan.nextInt();

        while(con==1){  
            System.out.println("k: ");
            int k = scan.nextInt();

            // get KthToLast Node
            Node kthNode = lList.kthToLast(lList.head, k);

            lList.printNode(kthNode);
            
            System.out.println("Start: 1\nEnd: 2");
            con = scan.nextInt();
        }
        scan.close();
    }
}
