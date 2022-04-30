import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Tests {

    @Test
    public void dataTest() {
        ListNode<String> node = new Node<>("msg");
        Assert.assertTrue(node.data().equals("msg"));
    }

    @Test
    public void nextTest() {
        ListNode<Integer> node1 = new Node<>(1);
        ListNode<Integer> node2 = new Node<>(2);
        node1.setNext(node2);
        Assert.assertEquals(node1.next(),node2);

    }

    @Test
    public void isEmptyTest() {
        ListNode<Integer> node1 = new Node<>(1);
        ListNode<Integer> node2 = new Node<>(2);
        node1.setNext(node2);
        Assert.assertNull(node2.next());
        Assert.assertNotNull(node1.next());
    }

    @Test
    public void hasCycleTest() {
        ListNode<Integer> node1 = new Node<>(1);
        ListNode<Integer> node2 = new Node<>(2);
        ListNode<Integer> node3 = new Node<>(3);
        ListNode<Integer> node4 = new Node<>(4);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node2);

        Assert.assertTrue(NodeUtils.hasCycle(node1));

    }

    @Test
    public void hasNotCycleTest() {
        ListNode<Integer> node1 = new Node<>(1);
        ListNode<Integer> node2 = new Node<>(2);
        ListNode<Integer> node3 = new Node<>(3);
        ListNode<Integer> node4 = new Node<>(4);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        Assert.assertFalse(NodeUtils.hasCycle(node1));

    }

    @Test
    public void ListTest() {
        ArrayList<Integer> foo = new ArrayList<>();
        ArrayList<Integer> bar = new ArrayList<>();
        bar.add(1);
        bar.add(2);
        bar.add(3);
        bar.add(4);
        bar.add(9);

        LList<Integer> list = new LList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(9);

        ListNode<Integer> node = list.getFirstNode();
        while (!node.isEmpty()) {
            foo.add(node.data());
            node = node.next();
        }
        foo.add(node.data());

        Assert.assertEquals(foo,bar);
    }
}
