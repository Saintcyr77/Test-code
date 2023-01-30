public class Main {
    public static void main(String[] args) {
        MyLinkedList ll =new MyLinkedList();
        ll.addAtHead(20);
        ll.addAtHead(30);
        ll.addAtTail(50);
        ll.addAtTail(60);
        ll.addAtIndex(2,10);
        ll.deleteAtIndex(2);

    }
}