public class Node {
    String data;
    Node prev;
    Node next;

    public Node(String item) {
        this.data = item;
        this.prev = null;
        this.next = null;
    }
}
