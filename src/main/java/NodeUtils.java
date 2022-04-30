import java.util.HashSet;

public interface NodeUtils {

     static <T> boolean hasCycle(ListNode<T> next) {
        HashSet<ListNode<T>> visited =  new HashSet<>();
        while (!next.isEmpty()) {
            if (!visited.contains(next)) {
                visited.add(next);
                next = next.next();
            }
            else {
                return true;
            }
        }
        return false;
    }
}
