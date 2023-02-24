public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void insertAtHead(String value) {
        Node newNode = new Node(value);
        if (null == head) {
            /* If list is empty */
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
            tail = newNode;
            size++;
        } else {
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
            size++;
        }
    }
    public void insertAtTail(String value) {
        Node newNode = new Node(value);
        if (null == tail) {
            /* If list is empty */
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
            tail = newNode;
            size++;
        } else {
            tail.next = newNode;
            newNode.next = null;
            newNode.prev = tail;
            tail = newNode;
            size++;
        }
    }

    public void traverseForward() {
        Node temp = head;
        System.out.println("");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void traverseBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
