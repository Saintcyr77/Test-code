class MyLinkedList {
    Node head;
    int length;
    class Node{
        Node next = null;
        int val;

        Node(int val){
            this.val = val;
        }
    }

    public MyLinkedList() {
        this.head  = null;
        this.length = 0;
    }

    public int get(int index) {
        if(index>=length) return -1;

        else{
            int i = 0;
            Node cur = head;

            while(i<index){
                i++;
                cur = cur.next;
            }
            return cur.val;
        }
    }

    public void addAtHead(int val) {
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
        length++;
    }

    public void addAtTail(int val) {
        if(head==null){
            addAtHead(val);
        }
        else{
            Node newnode = new Node(val);
            Node cur = head;
            while(cur.next!=null){
                cur = cur.next;
            }
            cur.next = newnode;
            length++;
        }
    }

    public void addAtIndex(int index, int val) {
        if(index>length) return;

        if(index==0){
            addAtHead(val);
        }
        else{
            Node cur = head;
            int i = 1;
            while(i<index){
                i++;
                cur = cur.next;
            }
            Node newnode =  new Node(val);
            Node next = cur.next;
            cur.next = newnode;
            newnode.next = next;
            length++;
        }


    }

    public void deleteAtIndex(int index) {
        if(index>=length) return;

        if(index==0){
            head = head.next;
            length--;
        }
        else{
            Node cur = head;
            int i = 1;
            while(i<index){
                i++;
                cur = cur.next;
            }
            cur.next = cur.next.next;
            length--;
        }
    }
}