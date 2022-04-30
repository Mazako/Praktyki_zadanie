public class LList <T> {
    private ListNode<T> firstNode;
    private ListNode<T> lastNode;

    public LList(T value) {
        this.firstNode = new Node<>(value);
    }

    public LList() {

    }

    public void add(T value) {
        if (firstNode == null) {
            firstNode = new Node<>(value);
            lastNode = firstNode;
        } else {
            ListNode<T> tmpNode = new Node<>(value);
            lastNode.setNext(tmpNode);
            lastNode = tmpNode;
        }
    }

    public void show() {
        ListNode<T> tmp = firstNode;
        while (!tmp.isEmpty()) {
            System.out.println(tmp);
            tmp = tmp.next();
        }
        System.out.println(tmp);
    }

    public ListNode<T> getFirstNode() {
        return firstNode;
    }
}
