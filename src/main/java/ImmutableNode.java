public final class ImmutableNode <T> implements ListNode<T>  {

    private final T data;
    private ListNode<T> next;

    public  ImmutableNode(T data) {
        this.data = data;
    }


    @Override
    public final T data() {
        return data;
    }

    @Override
    public final ListNode<T> next() {
        return next;
    }

    @Override
    public final ListNode<T> setNext(ListNode next) {
        this.next = next;
        return next;
    }

    @Override
    public final boolean isEmpty() {
        return next == null;
    }
}
