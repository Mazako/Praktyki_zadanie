import java.util.Objects;

public class Node <T> implements ListNode<T>{

    private T data;
    private ListNode<T> next;

    public Node(T data) {
        this.data = data;
    }


    @Override
    public T data() {
        return data;
    }


    @Override
    public ListNode<T> next() {
        return next;
    }

    @Override
    public ListNode<T> setNext(ListNode<T> next) {
        this.next = next;
        return next;
    }

    @Override
    public boolean isEmpty() {
        return next == null;
    }

    @Override
    public String toString() {
        return "data=" + data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(data, node.data) && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
