public class Tested {
    public static void main(String[] args) {
        LList<Integer> list = new LList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        ListNode<Integer> node = list.getFirstNode();
        while (!node.isEmpty()) {
            System.out.println(node.data());
            node = node.next();
        }

    }
}
