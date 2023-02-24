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
    public Node searchByValue(String value) {
        /* Traverse through each node until this value is found */
        Node temp = head;
        while (temp != null && !temp.data.equals(value)) {
            temp = temp.next;
        }
        if (temp != null && temp.data.equals(value)) {
            System.out.println("Valor encontrado: " + temp.data);
            return temp;
        }
        System.out.println("Valor no encontrado: ");
        return null;
    }
    public Node searchByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index passed while searching for a value");
        }
        /* Validation passed, let's search for value using the index */
        Node temp = head;
        for (int i = 0; i < index; i++) {
            /* Start from 0 and go till one less then index
             * because we are jumping to next node inside the loop */
            temp = temp.next;
        }
        System.out.println(temp.data);
        return temp;
    }
    public void deleteFromPosition(int position) {
        if (position < 0 || position >= size) {
            throw new IllegalArgumentException("Position is Invalid");
        }
        /* Conditions check passed, let's delete the node */
        Node nodeToBeDeleted = head;
        for (int i = 0; i < position; i++) {
            nodeToBeDeleted = nodeToBeDeleted.next;
        }
        Node previousNode = nodeToBeDeleted.prev;
        Node nextNode = nodeToBeDeleted.next;
        previousNode.next = nextNode;
        nextNode.prev = previousNode;
        size--;
    }
}
